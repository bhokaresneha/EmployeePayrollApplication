package com.example.employeepayroll_springboot.services;

import com.example.employeepayroll_springboot.dto.EmployeePayrollDTO;
import com.example.employeepayroll_springboot.model.EmployeePayroll;
import com.example.employeepayroll_springboot.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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


    public List<EmployeePayroll>getEmployeePayrollData() {
      return  employeePayrollRepository.findAll();

    }
    public Optional<EmployeePayroll> getEmployeeById(int id) {
        return employeePayrollRepository.findById(id);
    }



    public EmployeePayroll createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayroll empData = new EmployeePayroll(employeePayrollDTO);
       // empDataList.add(empData);
        employeePayrollRepository.save(empData);
        return empData;
    }

    public EmployeePayroll editEmployee(int id,EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayroll existingEmployee = employeePayrollRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setName(employeePayrollDTO.getName());
            existingEmployee.setDepartment(employeePayrollDTO.getDepartment());
            existingEmployee.setGender(employeePayrollDTO.getGender());
            existingEmployee.setSalary(employeePayrollDTO.getSalary());
            existingEmployee.setProfilePic(employeePayrollDTO.getProfilePic());
            existingEmployee.setNote(employeePayrollDTO.getNote());
            employeePayrollRepository.save(existingEmployee);
            return existingEmployee;
        }else return null;
    }

    public void deleteEmployee(int id)
    {
        employeePayrollRepository.deleteById(id);
    }

}
