package com.vimukthibw.department_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepartmentModel

{
    private Long depId;
    private String name;
    private List<Employee> employees = new ArrayList<>();


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
