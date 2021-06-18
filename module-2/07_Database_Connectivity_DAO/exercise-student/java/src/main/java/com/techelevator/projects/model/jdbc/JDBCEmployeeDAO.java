package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}



	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployees = new ArrayList<>();

		String selectAllEmployees = "Select * from employee";

		SqlRowSet allEmployeeRows = jdbcTemplate.queryForRowSet(selectAllEmployees);
		while(allEmployeeRows.next()) {
			allEmployees.add(mapRowToEmployee(allEmployeeRows));
		}

		return allEmployees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> searchEmployeesByName = new ArrayList<>();

		String sqlSearchEmployeesByName = "Select * from employee " +
				" where name ilike " +
				" ?" +
				" ?";

		SqlRowSet searchEmployeesByNameRows = jdbcTemplate.queryForRowSet(sqlSearchEmployeesByName, firstNameSearch, lastNameSearch );

		while(searchEmployeesByNameRows.next()) {
			searchEmployeesByName.add(mapRowToEmployee(searchEmployeesByNameRows));
		}
		return searchEmployeesByName;
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		return new ArrayList<>();
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		return new ArrayList<>();
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		return new ArrayList<>();
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		
	}

	private Employee mapRowToEmployee(SqlRowSet results) {
		Employee theEmployee = new Employee();

		theEmployee.setEmployeeId(results.getLong("employee_id"));
		theEmployee.setFirstName(results.getString("first_name"));
		theEmployee.setLastName(results.getString("last_name"));
		return theEmployee;
	}


}
