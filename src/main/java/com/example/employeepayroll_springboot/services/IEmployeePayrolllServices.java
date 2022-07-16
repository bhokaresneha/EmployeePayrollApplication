package com.example.employeepayroll_springboot.services;

import com.example.employeepayroll_springboot.dto.EmployeePayrollDTO;
import com.example.employeepayroll_springboot.model.EmployeePayroll;

import java.util.List;
import java.util.Optional;

public interface IEmployeePayrolllServices {

    List<EmployeePayroll> getEmployeePayrollData();
    Optional<EmployeePayroll> getEmployeeById(int id);
    EmployeePayroll createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
    EmployeePayroll editEmployee(int id,EmployeePayrollDTO employeePayrollDTO);
    void deleteEmployee(int id);

     List<EmployeePayroll> getEmployeeByDepartment(String department);
}
