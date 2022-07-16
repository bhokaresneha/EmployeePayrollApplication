package com.example.employeepayroll_springboot.repository;
import com.example.employeepayroll_springboot.model.EmployeePayroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeePayrollRepository extends JpaRepository<EmployeePayroll, Integer> {

    @Query(value="SELECT * FROM employeepayroll.employee_payroll e,employeepayroll.employee_department ed WHERE e.employee_id = ed.id AND ed.department = :department", nativeQuery= true)
    List<EmployeePayroll> findEmployeeByDepartment (@Param("department") String department);


}
