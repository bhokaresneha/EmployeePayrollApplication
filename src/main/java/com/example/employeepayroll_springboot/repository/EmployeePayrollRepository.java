package com.example.employeepayroll_springboot.repository;
import com.example.employeepayroll_springboot.model.EmployeePayroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayroll, Integer> {
}
