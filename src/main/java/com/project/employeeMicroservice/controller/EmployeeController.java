package com.project.employeeMicroservice.controller;

import com.project.employeeMicroservice.model.EmpDetails;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @GetMapping("/{empId}")
    public EmpDetails empId(@PathVariable("empId") int emp_id) {
        return new EmpDetails(emp_id, "khadoos", "DaantnaD2", "Khadoos@amazon.com", "Banglore",
                "aug-2021", 7307683871l, 10000l, "Messanger");
    }

}