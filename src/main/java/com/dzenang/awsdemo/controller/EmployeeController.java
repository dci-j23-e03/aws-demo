package com.dzenang.awsdemo.controller;

import com.dzenang.awsdemo.entity.Employee;
import com.dzenang.awsdemo.model.EmployeeDto;
import com.dzenang.awsdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeRepository employeeRepository;

    public EmployeeController(@Autowired EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody EmployeeDto employeeDto) {
        Employee employee = new Employee(employeeDto.name(), employeeDto.role());
        return employeeRepository.save(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
