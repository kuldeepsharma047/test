package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }

    @GetMapping("/employees")
    public Employee getEmployeeById(int id) {
        return employeeService.getEmployeeById(id);
    }

    public void deleteEmployee(int id) {
        employeeService.deleteEmployee(id);
    }

}
