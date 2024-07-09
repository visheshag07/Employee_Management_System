package com.example.demo.controller;


import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//// Get api
@RequestMapping("/employee")

public class EmployeeController {

    @GetMapping("/my-name")
    public String myName(){
        return "my name is Vishesh Agrawal";
    }



    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping
    public List<Employee>getAllEmployee(){
        return employeeRepository.findAll();
    }


    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return employeeRepository.save(employee);
    }
//build get employee by Id REST API
    @GetMapping("/{id}")
    public  ResponseEntity<Employee>getEmployeeById(@PathVariable  long id){
        Employee employee=employeeRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Employee not exist with id"+id));
        return ResponseEntity.ok(employee);

    }

    // get employees by name

// update employee rest api
    @PutMapping("/{id}")
    public ResponseEntity<Employee>updateEmployee(@PathVariable  long id,@RequestBody  Employee employeeDetails) {
        Employee updateEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id" + id));
        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setEmailId(employeeDetails.getEmailId());
        employeeRepository.save(updateEmployee);
        return ResponseEntity.ok(updateEmployee);
    }
        //Delete employee rest api
        @DeleteMapping("{id}")
        public ResponseEntity<HttpStatus>deleteEmployee(@PathVariable  long id) {
            Employee employee= employeeRepository.findById(id)
                    .orElseThrow(()->new ResourceNotFoundException("Employee not exist with id"+id));
            employeeRepository.delete(employee);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }



