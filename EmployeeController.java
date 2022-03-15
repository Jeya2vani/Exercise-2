package com.example.springmongodb.resource;

import com.example.springmongodb.model.Employee;
import com.example.springmongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Emp")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/findAllEmployee")
    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }
}
