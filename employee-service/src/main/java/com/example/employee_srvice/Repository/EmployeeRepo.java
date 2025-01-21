package com.example.employee_srvice.Repository;

import com.example.employee_srvice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
