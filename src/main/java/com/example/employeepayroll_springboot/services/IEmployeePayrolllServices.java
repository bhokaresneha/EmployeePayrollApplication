package com.example.employeepayroll_springboot.services;

import com.example.employeepayroll_springboot.dto.EmployeePayrollDTO;
import com.example.employeepayroll_springboot.model.EmployeePayroll;

import java.util.List;

public interface IEmployeePayrolllServices {

    List<EmployeePayroll> getEmployeePayrollData();
    EmployeePayroll getEmployeeById(int id);
    EmployeePayroll createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
    EmployeePayroll editEmployee(EmployeePayrollDTO employeePayrollDTO);
    void deleteEmployee(int id);
}
