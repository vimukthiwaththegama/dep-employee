package com.vimukthibw.employe_service.repository;

import com.vimukthibw.employe_service.module.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository
{
    private final List<Employee> employees = new ArrayList<>();

    public Employee addEmployee( Employee employee )
    {
        employees.add( employee );
        return employee;
    }

    public Employee findById( Long id )
    {
        return employees.stream().
                        filter( employee -> employee.getEmpId().equals( id ) ).
                        findFirst().orElseThrow();
    }

    public List<Employee> findAll()
    {
        return employees;
    }

    public void deleteEmployee( Long id )
    {
        employees.remove( findById( id ) );
    }
    public List<Employee> findByDepartment(Long departmentId) {
        return employees.stream()
                        .filter(a -> a.getDepartmentId().equals(departmentId))
                        .toList();
    }
}
