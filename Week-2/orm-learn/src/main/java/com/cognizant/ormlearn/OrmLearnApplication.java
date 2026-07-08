package com.cognizant.ormlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.StockService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.SkillService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;
    private static StockService stockService;
    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static SkillService skillService; 

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        employeeService = context.getBean(EmployeeService.class);
        testGetAllEmployeesNative();
    }

    private static void testGetAllEmployeesNative() {

        LOGGER.info("Start");

        employeeService.getAllEmployeesNative()
                       .forEach(System.out::println);

        LOGGER.info("End");
    }
    }
    