package com.example.employeepayroll_springboot.services;

import com.example.employeepayroll_springboot.dto.EmployeePayrollDTO;
import com.example.employeepayroll_springboot.dto.ResponseDTO;
import com.example.employeepayroll_springboot.model.EmployeePayroll;
import com.example.employeepayroll_springboot.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeePayrollServices implements IEmployeePayrolllServices {

//    @Autowired
//    EmployeePayrollRepository employeePayrollRepository;
//    public String displayMessage(){
//        return "Welcome to Employee Payroll Application";
//    }
//
//    public EmployeePayroll addEmployee(EmployeePayroll employee) {
//        return employeePayrollRepository.save(employee);
//    }

    public List<EmployeePayroll>getEmployeePayrollData() {
        List<EmployeePayroll> empDataList = new ArrayList<>();
        empDataList.add(new EmployeePayroll(1, new EmployeePayrollDTO("Sneha Bhokare", "Female", "Sales", 35000)));
        return empDataList;
    }
    public EmployeePayroll getEmployeeById(int id) {
        EmployeePayroll empData;
        empData=new EmployeePayroll(1,new EmployeePayrollDTO("Sneha Bhokare", "Female", "Sales", 35000));
       return empData;
    }


    public EmployeePayroll createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayroll empData;
        empData = new EmployeePayroll(1, new EmployeePayrollDTO("Sneha Bhokare", "Female", "Sales", 35000));
        return empData;
    }

    public EmployeePayroll editEmployee(EmployeePayrollDTO employeePayrollDTO) {
       EmployeePayroll empData;
       empData=new EmployeePayroll(1,employeePayrollDTO);
       return empData;
    }

    public void deleteEmployee(int id) {


    }

}
