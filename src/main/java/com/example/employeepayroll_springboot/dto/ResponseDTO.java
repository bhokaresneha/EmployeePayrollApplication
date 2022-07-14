package com.example.employeepayroll_springboot.dto;

import com.example.employeepayroll_springboot.model.EmployeePayroll;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
        private String message;
        private Object data;

}
