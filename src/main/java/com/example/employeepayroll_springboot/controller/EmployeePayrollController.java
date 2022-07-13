package com.example.employeepayroll_springboot.controller;

import com.example.employeepayroll_springboot.model.EmployeePayroll;
import com.example.employeepayroll_springboot.services.EmployeePayrollServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

//UC-2

    @PostMapping("/addEmployeePayrollData")
    public EmployeePayroll createEmployee(@RequestBody EmployeePayroll employee){
        return employeePayrollServices.addEmployee(employee);
    }
    @GetMapping("/getEmployee/{id}")
    public Optional<EmployeePayroll> getEmployeeById(@PathVariable int id){
        return employeePayrollServices.getEmployeeById(id);
    }
    @GetMapping("/allEmployees")
    public List<EmployeePayroll> displayAllEmployees() {
        return employeePayrollServices.getEmployees();
    }
    @PutMapping("/editEmployee/{id}")
    public EmployeePayroll editEmployee(@RequestBody EmployeePayroll employee, @PathVariable int id){
        return employeePayrollServices.editEmployee(employee,id);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeePayrollServices.deleteEmployee(id);
    }
}
