package com.example.employeepayroll_springboot.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePayrollDTO {

    @NotNull(message = "Employee Name cannot be null")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name Invalid")
    public String name;
    @NotNull(message = "Employee Gender cannot be null")
    public String gender;
    @NotNull(message = "Employee Department cannot be null")
    public List<String> department;
    @Min(value = 500, message = "Min Wage should be more than 500")
    public long salary;

    @NotNull(message = "Employee ProfilePic cannot be null")
    public String profilePic;

    @NotNull(message = "Employee Note cannot be null")
    public String note;

    public LocalDate startDate;



}