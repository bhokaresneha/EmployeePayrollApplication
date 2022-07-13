package com.example.employeepayroll_springboot.model;

import com.example.employeepayroll_springboot.dto.EmployeePayrollDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

    public EmployeePayroll() {

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getId() {
        return id;
    }
}
