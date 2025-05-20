package com.project.employeeMicroservice.controller;

import com.project.employeeMicroservice.model.EmpDetails;
import com.project.employeeMicroservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{empId}") 
    public EmpDetails getEmployee(@PathVariable int empId) {
    return employeeService.findEmployee(empId);

    }

    @PostMapping("/create/{id}")
    public EmpDetails createUser(@PathVariable int id , @RequestBody EmpDetails emp){
        emp.setId(id);
        return emp;
    }


}