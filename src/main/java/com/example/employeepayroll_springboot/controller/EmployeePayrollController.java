package com.example.employeepayroll_springboot.controller;

import com.example.employeepayroll_springboot.dto.EmployeePayrollDTO;
import com.example.employeepayroll_springboot.dto.ResponseDTO;
import com.example.employeepayroll_springboot.model.EmployeePayroll;
import com.example.employeepayroll_springboot.services.EmployeePayrollServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    EmployeePayrollServices employeePayrollServices;
//
////UC-1
//    @RequestMapping("/")
//    public String displayMessage(){
//        return "Hiiii  "+employeePayrollServices.displayMessage();
//
//    }
//
////UC-2
//
//    @PostMapping("/create")
//    public EmployeePayroll createEmployee(@RequestBody EmployeePayroll employee){
//        return employeePayrollServices.addEmployee(employee);
//    }
//    @GetMapping("/getEmployee/{id}")
//    public Optional<EmployeePayroll> getEmployeeById(@PathVariable int id){
//        return employeePayrollServices.getEmployeeById(id);
//    }
//    @GetMapping("/allEmployees")
//    public List<EmployeePayroll> displayAllEmployees() {
//        return employeePayrollServices.getEmployees();
//    }
//    @PutMapping("/edit/{id}")
//    public EmployeePayroll editEmployee(@RequestBody EmployeePayroll employee, @PathVariable int id){
//        return employeePayrollServices.editEmployee(employee,id);
//    }
//    @DeleteMapping("/delete/{id}")
//    public void deleteEmployee(@PathVariable int id){
//        employeePayrollServices.deleteEmployee(id);
//    }


    @RequestMapping(value = {"", "/ ", "get"})

    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        List <EmployeePayroll> empDatalist ;
        empDatalist = employeePayrollServices.getEmployeePayrollData();
        ResponseDTO respOTO = new ResponseDTO("Get Call Successful", empDatalist);
        return new ResponseEntity<ResponseDTO>(respOTO, HttpStatus.OK);
    }


    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        EmployeePayroll empData;
        empData= employeePayrollServices.getEmployeeById(empId);
        ResponseDTO respDTO= new ResponseDTO("Get Call For ID Successful", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayroll  empData;
        empData= employeePayrollServices.createEmployeePayrollData(empPayrollDTO);
        ResponseDTO respDTO= new ResponseDTO("Created Employee Payroll Data Successfully", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("id")int id,@RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayroll empData;
        empData= employeePayrollServices.editEmployee(id,empPayrollDTO);
        ResponseDTO respDTO= new ResponseDTO("Updated Employee Payroll Data Successfully", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
   @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId)
    {
        employeePayrollServices.deleteEmployee(empId);
        ResponseDTO respDTO= new ResponseDTO("Deleted Successfully", "Deleted id: "+empId);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);

    }

}
