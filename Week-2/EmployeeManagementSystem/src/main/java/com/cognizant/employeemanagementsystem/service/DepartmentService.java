package com.cognizant.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employeemanagementsystem.entity.Department;
import com.cognizant.employeemanagementsystem.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Save Department
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Get All Departments
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Get Department By Id
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    // Delete Department
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}