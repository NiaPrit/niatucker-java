package com.techelevator.projects.model;

import java.time.LocalDate;

public class Employee {
//instance variables
private long employeeId;
private long departmentId;
private String firstName;
private String lastName;
private String gender;
private String birthDate;
private String hireDate;


//toString() only return employee last name and first name

    @Override
    public String toString() {
        return "Employee{" +
                "lastName, firstName ='" + lastName + ',' + firstName + '\''+
                '}';
    }


//getters and setters

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }


    // TODO: Place code to describe the columns in the table row here
}
