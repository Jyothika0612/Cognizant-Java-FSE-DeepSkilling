package com.cognizant.ormlearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;

@Service
public class SkillService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).orElse(null);
    }
}