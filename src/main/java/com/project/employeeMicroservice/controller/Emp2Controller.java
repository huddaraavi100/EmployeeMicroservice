package com.project.employeeMicroservice.controller;

import com.project.employeeMicroservice.model.EmpDetails;
import com.project.employeeMicroservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Emp2Controller {
    @Autowired
    private EmployeeService service;
    @GetMapping("/employees")
    public List<EmpDetails> getALlEmployees(){
        return service.findEmployeeDetail();

    }
    @PutMapping("/employee/{empId}")
    public EmpDetails updateEmployee(@PathVariable int empId,@RequestBody EmpDetails emp){
        return service.updateEmployee(empId,emp);
    }
    @DeleteMapping("/deleteEmployee/{empId}")
    public String deleteData(@PathVariable int empId ){
        service.delete(empId);
        return "emloyeeData with id "  +empId+ " has been deleted" ;
    }
}
