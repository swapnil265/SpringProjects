package com.swapnil.full.controller;

import com.swapnil.full.entity.Department;
import com.swapnil.full.error.DepartmentNotFoundException;
import com.swapnil.full.repository.DepartmentRepository;
import com.swapnil.full.service.DepartmentService;
import com.swapnil.full.service.DepartmentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

public class DepartmentController {

    @Autowired // autowire that object with this reference this is property based attachment -constructor based bhi hai
    private DepartmentService departmentService;
    private final Logger LOGGER= LoggerFactory.getLogger(DepartmentController.class);

    //Save Department //@Request Body what ever data u are getting convert that to department entity
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
      //  DepartmentService service = new DepartmentServiceImpl(); No Need to do this as spring already has it.
        LOGGER.info("INSIDE POST MAPPING CONTROLLER ");
        return  departmentService.saveDepartment(department);
    }

    //Get the List of departments
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("departments/delete/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId ){
         departmentService.deleteDepartment(departmentId);
        return "Department deleted successfully :" +departmentId;
    }

    @PutMapping("/departments/update/{id}")
    public Department updateDepartment( @PathVariable("id") Long departmentId ,
                                        @RequestBody Department department){

        return departmentService.udpateDepartment(departmentId ,department);
    }
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }







}
