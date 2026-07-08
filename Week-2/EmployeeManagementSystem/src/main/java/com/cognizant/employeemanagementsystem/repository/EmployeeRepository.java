package com.cognizant.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.employeemanagementsystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

    List<Employee> findByEmailContaining(String text);

    List<Employee> findByDepartmentName(String departmentName);

    List<Employee> findByNameContainingIgnoreCase(String keyword);
}