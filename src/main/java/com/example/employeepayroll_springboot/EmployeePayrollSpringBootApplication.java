package com.example.employeepayroll_springboot;

import com.example.employeepayroll_springboot.model.EmployeePayroll;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class EmployeePayrollSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EmployeePayrollSpringBootApplication.class, args);
        log.info("Using Lombok Library for Logging");
     //uc-8
        log.info("Employee Payroll App Started in {} Environment",
                context.getEnvironment().getProperty("environment"));
     //uc-9
        log.info("Employee Payroll DB User is {}",
                context.getEnvironment().getProperty("spring.datasource.username"));


    }


}
