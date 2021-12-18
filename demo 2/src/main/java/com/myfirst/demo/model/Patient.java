package com.myfirst.demo.model;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter

public class Patient {
    //@Column(name = "id", unique = true, nullable = false)
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;
    private String sex;
    private Date dob;
    private String insuranceNumber;
    private String insuranceProvider;

}
