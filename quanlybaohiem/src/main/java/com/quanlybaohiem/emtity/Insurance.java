package com.quanlybaohiem.emtity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/*
insurance_internal_id	int	10	Y
insurance_number	varchar	10	Y
insurance_start_date	date		Y
insurance_end_date	date		Y
place_of_register	varchar	50	Y

 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_insurance")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insurance_internal_id", length = 10)
    private int id;
    @Column(name = "insurance_number", nullable = false, length = 10)
    private String insuranceNumber;
    @Column(name = "insurance_start_date", nullable = false)
    private Date startDate;

    @Column(name = "insurance_end_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "place_of_register", nullable = false, length = 50)
    private String placeOfRegister;

    @OneToMany(mappedBy = "insuranceInternalId")
    private List<User> users = new ArrayList<User>();
}
