package com.quanlybaohiem.dto;
/**
 *
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int companyInternalId;
    private int insuranceInternalId;
    private String username;
    private String password;
    private String fullName;
    private char userSexDivision;
    private Date birthDate;
}
