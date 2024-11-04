package com.dzenang.awsdemo.repository;

import com.dzenang.awsdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
