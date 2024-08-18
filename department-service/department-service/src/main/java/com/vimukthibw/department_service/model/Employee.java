package com.vimukthibw.department_service.model;

public class Employee
{
    private Long empId;
    private String empName;
    private Long departmentId;
    private Integer age;
    private String position;

    public Integer getAge()
    {
        return age;
    }

    public void setAge( Integer age )
    {
        this.age = age;
    }

    public Long getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId( Long departmentId )
    {
        this.departmentId = departmentId;
    }

    public Long getEmpId()
    {
        return empId;
    }

    public void setEmpId( Long empId )
    {
        this.empId = empId;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName( String empName )
    {
        this.empName = empName;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition( String position )
    {
        this.position = position;
    }

    public Employee( String position, String empName, Long empId, Long departmentId, Integer age )
    {
        this.position = position;
        this.empName = empName;
        this.empId = empId;
        this.departmentId = departmentId;
        this.age = age;
    }

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
