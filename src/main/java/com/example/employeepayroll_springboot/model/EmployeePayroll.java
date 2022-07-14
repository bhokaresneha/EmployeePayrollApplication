package com.example.employeepayroll_springboot.model;

import com.example.employeepayroll_springboot.dto.EmployeePayrollDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeePayroll {
    @Id
    @GeneratedValue
    int id;

    String name;
    Long salary;
    String department;
    String gender;


    public EmployeePayroll(int id, EmployeePayrollDTO employeePayrollDTO) {
        this.id=id;
        this.name= employeePayrollDTO.name;
        this.department=employeePayrollDTO.department;
        this.gender=employeePayrollDTO.gender;
        this.salary=employeePayrollDTO.salary;
    }

}
