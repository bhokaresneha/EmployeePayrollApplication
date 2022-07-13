package com.example.employeepayroll_springboot.services;

import com.example.employeepayroll_springboot.model.EmployeePayroll;
import com.example.employeepayroll_springboot.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollServices {

    @Autowired
    EmployeePayrollRepository employeePayrollRepository;
    public String displayMessage(){
        return "Welcome to Employee Payroll Application";
    }

    public EmployeePayroll addEmployee(EmployeePayroll employee) {
        return employeePayrollRepository.save(employee);
    }

    public Optional<EmployeePayroll> getEmployeeById(int id) {
        return employeePayrollRepository.findById(id);
    }

    public List<EmployeePayroll> getEmployees() {
        return employeePayrollRepository.findAll();
    }

    public EmployeePayroll editEmployee(EmployeePayroll employee, int id) {
        EmployeePayroll existingEmployee = employeePayrollRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setName(employee.getName());
            existingEmployee.setDepartment(employee.getDepartment());
            existingEmployee.setGender(employee.getGender());
            existingEmployee.setSalary(employee.getSalary());
            return employeePayrollRepository.save(existingEmployee);
        }else return null;
    }

    public void deleteEmployee(int id) {
        employeePayrollRepository.deleteById(id);
    }

}
