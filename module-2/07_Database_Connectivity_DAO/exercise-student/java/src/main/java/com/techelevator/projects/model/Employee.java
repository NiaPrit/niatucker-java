package com.techelevator.projects.model;

import java.time.LocalDate;

public class Employee {
//instance variables
private Long employeeId;
private Long departmentId;
private String firstName;
private String lastName;
private String gender;
private LocalDate birthDate;
private LocalDate hireDate;


//toString() only return employee last name and first name

    @Override
    public String toString() {
        return "Employee{" +
                "lastName, firstName ='" + lastName + ',' + firstName + '\''+
                '}';
    }


//getters and setters

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }


    // TODO: Place code to describe the columns in the table row here
}
