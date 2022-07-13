package com.example.employeepayroll_springboot.controller;

import com.example.employeepayroll_springboot.services.EmployeePayrollServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    EmployeePayrollServices employeePayrollServices;

//UC-1
    @RequestMapping("/")
    public String displayMessage(){
        return "Hiiii  "+employeePayrollServices.displayMessage();

    }
}
