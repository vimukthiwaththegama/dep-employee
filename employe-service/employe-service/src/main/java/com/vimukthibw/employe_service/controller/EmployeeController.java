package com.vimukthibw.employe_service.controller;

import com.vimukthibw.employe_service.module.Employee;
import com.vimukthibw.employe_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/employee" )
public class EmployeeController
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public Employee addEmployee( @RequestBody Employee employee )
    {
        return employeeRepository.addEmployee( employee );
    }

    @GetMapping( "/{id}" )
    public Employee getDepartment( @PathVariable Long id )
    {
        return employeeRepository.findById( id );
    }

    @GetMapping
    public List<Employee> findAll()
    {
        return employeeRepository.findAll();
    }

    @DeleteMapping( "/{id}" )
    public void deleteDepartment( @RequestParam Long id )
    {
        employeeRepository.deleteEmployee( id );
    }
}
