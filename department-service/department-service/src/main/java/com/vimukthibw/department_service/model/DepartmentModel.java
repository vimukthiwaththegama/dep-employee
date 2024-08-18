package com.vimukthibw.department_service.model;

import java.util.ArrayList;
import java.util.List;

public class DepartmentModel

{
    private Long depId;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public DepartmentModel( Long depId, String name, List<Employee> employees )
    {
        this.depId = depId;
        this.name = name;
        this.employees = employees;
    }

    public Long getDepId()
    {
        return depId;
    }

    public void setDepId( Long depId )
    {
        this.depId = depId;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public List<Employee> getEmployees()
    {
        return employees;
    }

    public void setEmployees( List<Employee> employees )
    {
        this.employees = employees;
    }

    @Override
    public String toString()
    {
        return "DepartmentModel{" +
                       "depId=" + depId +
                       ", name='" + name + '\'' +
                       ", employees=" + employees +
                       '}';
    }
}
