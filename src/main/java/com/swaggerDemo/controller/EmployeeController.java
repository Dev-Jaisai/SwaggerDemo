package com.swaggerDemo.controller;

import com.swaggerDemo.entity.Employee;
import com.swaggerDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/v1")
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public Employee addEmployee(@RequestBody Employee employee){
        employeeService.save(employee);
        return  employee;

    }
}
