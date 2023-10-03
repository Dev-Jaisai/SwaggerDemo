package com.swaggerDemo.service;

import com.swaggerDemo.entity.Employee;
import com.swaggerDemo.repo.EmployeeRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeService {

@Autowired
    EmployeeRepo employeeRepo;

    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }
}
