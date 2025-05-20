package com.project.employeeMicroservice.service;

import com.project.employeeMicroservice.model.EmpDetails;
import com.project.employeeMicroservice.repository.EmpDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmpDetailsRepository repo;
    public EmpDetails findEmployee(int empId ){
        return repo.findById(empId).orElse(null);

    }

    public List<EmpDetails> findEmployeeDetail(){
        return repo.findAll();

    }
    public EmpDetails updateEmployee(int id,EmpDetails updatedData){
        EmpDetails existingEmp=repo.findById(id).orElse(null);
        if(existingEmp!=null){
            existingEmp.setId(updatedData.getId());
            existingEmp.setDept(updatedData.getDept());
            existingEmp.setAddress(updatedData.getAddress());
            existingEmp.setDoj(updatedData.getDoj());
            existingEmp.setDesignation(updatedData.getDesignation());
            existingEmp.setEmail(updatedData.getEmail());
            existingEmp.setPhone(updatedData.getPhone());
            existingEmp.setSal(updatedData.getSal());
            return repo.save(existingEmp);

        }
        else{
            return null;
        }
    }
    public void delete(int id){
         repo.deleteById(id);
    }

}
