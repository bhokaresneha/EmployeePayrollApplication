package com.example.employeepayroll_springboot.controller;

import com.example.employeepayroll_springboot.dto.EmployeePayrollDTO;
import com.example.employeepayroll_springboot.dto.ResponseDTO;
import com.example.employeepayroll_springboot.model.EmployeePayroll;
import com.example.employeepayroll_springboot.services.IEmployeePayrolllServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    IEmployeePayrolllServices iEmployeePayrolllServices;
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
        List <EmployeePayroll> empDatalist=iEmployeePayrolllServices.getEmployeePayrollData();
        ResponseDTO respOTO = new ResponseDTO("Get Call Successful", empDatalist);
        return new ResponseEntity<ResponseDTO>(respOTO, HttpStatus.OK);
    }


    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        Optional<EmployeePayroll> empData= iEmployeePayrolllServices.getEmployeeById(empId);
        ResponseDTO respDTO= new ResponseDTO("Get Call For ID Successful", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@Valid @RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayroll empData= iEmployeePayrolllServices.createEmployeePayrollData(empPayrollDTO);
        ResponseDTO respDTO= new ResponseDTO("Created Employee Payroll Data Successfully", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("id")int id,@RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayroll empData = iEmployeePayrolllServices.editEmployee(id,empPayrollDTO);
        ResponseDTO respDTO= new ResponseDTO("Updated Employee Payroll Data Successfully", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
   @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId)
    {
        iEmployeePayrolllServices.deleteEmployee(empId);
        ResponseDTO respDTO= new ResponseDTO("Deleted Successfully", "Deleted id: "+empId);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);

    }

    @GetMapping("/get")
    public String Getdata(){
        return "Helllo";
    }
}
