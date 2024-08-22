package com.vimukthibw.department_service.controller;

import com.vimukthibw.department_service.model.DepartmentModel;
import com.vimukthibw.department_service.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/department" )
public class DepartmentController
{
    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping
    public DepartmentModel addDepartment( @RequestBody DepartmentModel departmentModel )
    {
        return departmentRepo.addDepartment( departmentModel );
    }

    @GetMapping( "/{id}" )
    public DepartmentModel getDepartment( @PathVariable Long id )
    {
        return departmentRepo.findById( id );
    }

    @GetMapping
    public List<DepartmentModel> findAll()
    {
        return departmentRepo.findAll();
    }

    @DeleteMapping( "/{id}" )
    public void deleteDepartment( @RequestParam Long id )
    {
        departmentRepo.deleteDepartment( id );
    }
}
