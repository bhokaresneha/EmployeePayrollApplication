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

    @Autowired
    EmployeePayrollRepository employeePayrollRepository;
//    public String displayMessage(){
//        return "Welcome to Employee Payroll Application";
//    }
//
//    public EmployeePayroll addEmployee(EmployeePayroll employee) {
//        return employeePayrollRepository.save(employee);
//    }

    private List<EmployeePayroll> empDataList = new ArrayList<>();

    public List<EmployeePayroll>getEmployeePayrollData() {

        return empDataList;
    }
    public EmployeePayroll getEmployeeById(int id) {
       return empDataList.get(id-1);
    }



    public EmployeePayroll createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayroll empData = new EmployeePayroll(empDataList.size()+1,employeePayrollDTO);
        empDataList.add(empData);
        return empData;
    }

    public EmployeePayroll editEmployee(int id,EmployeePayrollDTO employeePayrollDTO) {
       EmployeePayroll empData=this.getEmployeeById(id);
       empData.setName(employeePayrollDTO.name);
       empData.setDepartment(employeePayrollDTO.department);
       empData.setGender(employeePayrollDTO.gender);
       empData.setSalary(employeePayrollDTO.salary);
       empDataList.set(id-1,empData);
       return empData;
    }

    public void deleteEmployee(int id)
    {
        empDataList.remove(id-1);
    }

}
