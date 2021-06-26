package com.techelevator.controller;

import com.techelevator.model.Department;
import com.techelevator.model.DepartmentDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


/**
 * Controller to process API requests.
 */


@RestController // tells server there are methods in here to handle URL paths it might get
public class DepartmentController {

 //Define a reference to the Department DAO so we can handle API calls to get Department data
 DepartmentDAO theDeptData;

 //constructor for the controller class to receieve DAO objects and assign to our references
public DepartmentController(DepartmentDAO theDeptMethods){
    theDeptData = theDeptMethods;
}

@RequestMapping(path="/department", method= RequestMethod.GET)
public List<Department> getTheDepartments(){
    List<Department> theDepartments = new ArrayList();
    return theDepartments;
}
public void logAPICall(String message) {
	 LocalDateTime now = LocalDateTime.now();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss.A");
     String timeNow = now.format(formatter);
     System.out.println(timeNow + "-" + message);
 }
}


