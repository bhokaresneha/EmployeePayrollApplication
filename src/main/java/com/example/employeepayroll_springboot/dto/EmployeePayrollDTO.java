package com.example.employeepayroll_springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

//@Getter
//@Setter
@Data
@AllArgsConstructor
public class EmployeePayrollDTO {

    @NotNull(message = "Employee Name cannot be null")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name Invalid")
    public String name;
    @NotNull(message = "Employee Gender cannot be null")
    public String gender;
    @NotNull(message = "Employee Department cannot be null")
    public String department;
    @Min(value = 500, message = "Min Wage should be more than 500")
    public long salary;



}