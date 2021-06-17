package com.techelevator.projects.model;

public class Department {
//instance variables

private Long departmentId;
private String name;

//toString return ONLY the project name

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }

//getters and setters

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


// TODO: Place code to describe the columns in the table row here
}