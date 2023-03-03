package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public

    List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void updateEmployee(Employee employee) {
        for (Employee emp : employees) {
            if (emp.getId() == employee.getId()) {
               // emp.setName(employee.getName());
                //emp.setEmail(employee.getEmail());
            }
        }
    }


    public void deleteEmployee(int id) {
    }
}
