package com.vimukthibw.employe_service.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee
{
    private Long empId;
    private String empName;
    private Long departmentId;
    private Integer age;
    private String position;


    @Override
    public String toString()
    {
        return "Employee{" +
                       "age=" + age +
                       ", empId=" + empId +
                       ", empName='" + empName + '\'' +
                       ", departmentId=" + departmentId +
                       ", position='" + position + '\'' +
                       '}';
    }
}
