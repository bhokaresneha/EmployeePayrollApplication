package com.example.employeepayroll_springboot.model;

import com.example.employeepayroll_springboot.dto.EmployeePayrollDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public @ToString class EmployeePayroll {
    @Id
    @GeneratedValue
    int id;

    String name;
    Long salary;
    @ElementCollection
    public List<String> department;
    String gender;
    String profilePic;
    String note;
    LocalDate startDate;


    public EmployeePayroll(int id, EmployeePayrollDTO employeePayrollDTO) {
        this.id=id;
        this.name= employeePayrollDTO.name;
        this.department=employeePayrollDTO.department;
        this.gender=employeePayrollDTO.gender;
        this.salary=employeePayrollDTO.salary;
        this.startDate=employeePayrollDTO.startDate;
        this.profilePic=employeePayrollDTO.profilePic;
        this.note=employeePayrollDTO.note;
    }

}
