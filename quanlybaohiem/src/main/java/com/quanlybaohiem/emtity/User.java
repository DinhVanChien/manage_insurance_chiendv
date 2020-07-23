package com.quanlybaohiem.emtity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_internal_id", length = 10)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    // Many to One Có nhiều user ở 1 cty
    // thông qua khóa ngoại company_id
    @JoinColumn(name = "company_internal_id", nullable = false)
    private Company companyInternalId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insurance_internal_id", nullable = false)
    private Insurance insuranceInternalId;
    @Column(name = "username", nullable = false, length = 15)
    private String username;
    @Column(name = "password", nullable = false, length = 32)
    private String password;
    @Column(name = "user_full_name", nullable = false, length = 50)
    private String fullName;
    @Column(name = "user_sex_division", nullable = false, length = 2)
    private char userSexDivision;
    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
}
