package com.example.employeepayroll_springboot.dto;

import lombok.Data;

@Data
public class EmployeePayrollDTO {

    public String name;
    public String gender;
    public String department;
    public long salary;

//    public EmployeePayrollDTO(String name, String gender, String department, long salary) {
//        this.name = name;
//        this.gender = gender;
//        this.department = department;
//        this.salary = salary;
//    }
}