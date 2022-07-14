package com.example.employeepayroll_springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeePayrollDTO {

    public String name;
    public String gender;
    public String department;
    public long salary;
}