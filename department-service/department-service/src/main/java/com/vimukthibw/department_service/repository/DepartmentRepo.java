package com.vimukthibw.department_service.repository;

import com.vimukthibw.department_service.model.DepartmentModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository

public class DepartmentRepo {

    private List<DepartmentModel> departments = new ArrayList<>();

    public DepartmentModel addDepartment( DepartmentModel departmentModel )
    {
        departments.add( departmentModel );
        return departmentModel;
    }

    public DepartmentModel findById( Long id )
    {
        return departments.stream().
                          filter( departmentModel -> departmentModel.getDepId().equals( id ) ).
                          findFirst().orElseThrow();
    }

    public List<DepartmentModel> findAll()
    {
        return departments;
    }

    public void deleteDepartment( Long id )
    {
        departments.remove( findById( id ) );
    }

}
