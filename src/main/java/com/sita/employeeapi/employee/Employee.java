package com.sita.employeeapi.employee;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  empId;
    private String empName;
    private String empSurname;
    private String empEmail;
    private LocalDateTime dateAdded;


}
