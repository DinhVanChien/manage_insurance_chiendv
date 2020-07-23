package com.quanlybaohiem.emtity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
company_internal_id	int	10	Y
company_name	varchar	50	Y
address	varchar	100	Y
email	varchar	50
telephone	varchar	15

 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_company")

public class Company  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "company_internal_id", length = 10)
    private int id;
    @Column(name = "company_name", nullable = false, length = 50)
    private String name;
    @Column(name = "address", nullable = false, length = 100)
    private String address;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "telephone", length = 15)
    private String telephone;

    @OneToMany(mappedBy = "companyInternalId")
    private List<User> users = new ArrayList<User>();;

}
