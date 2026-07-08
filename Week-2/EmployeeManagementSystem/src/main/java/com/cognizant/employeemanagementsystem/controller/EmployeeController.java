package com.cognizant.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Create Employee
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // Get All Employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Get Employee By Id
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    // Delete Employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }

    // Find Employee by Name
    @GetMapping("/name/{name}")
    public List<Employee> getEmployeesByName(@PathVariable String name) {
        return employeeService.getEmployeesByName(name);
    }

    // Find Employee by Email
    @GetMapping("/email/{text}")
    public List<Employee> getEmployeesByEmail(@PathVariable String text) {
        return employeeService.getEmployeesByEmail(text);
    }

    // Find Employees by Department
    @GetMapping("/department/{departmentName}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String departmentName) {
        return employeeService.getEmployeesByDepartment(departmentName);
    }

    // Search Employees by Name
    @GetMapping("/search/{keyword}")
    public List<Employee> searchEmployees(@PathVariable String keyword) {
        return employeeService.searchEmployees(keyword);
    }
}