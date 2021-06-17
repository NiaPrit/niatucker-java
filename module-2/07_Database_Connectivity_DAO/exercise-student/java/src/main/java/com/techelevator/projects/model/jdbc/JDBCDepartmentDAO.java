package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;
import org.springframework.jdbc.core.SqlRowSetResultSetExtractor;
import org.springframework.jdbc.support.rowset.SqlRowSet;

// Concrete class for the DAO which implements the methods required by the interface

// this tells us the source
public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public List<Department> getAllDepartments() {
	List<Department> allDepartments = new ArrayList();

	String selectAllDepartments = "Select * from department";

	SqlRowSet allDepartmentRows = jdbcTemplate.queryForRowSet(selectAllDepartments);
	while(allDepartmentRows.next()) {
		allDepartments.add(mapRowToDepartment(allDepartmentRows));

	}

		return allDepartments;
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {



		return new ArrayList<>();
	}





	@Override
	public void saveDepartment(Department updatedDepartment) {
		
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		return null;
	}

	@Override
	public Department getDepartmentById(Long id) {
		return null;
	}

	private Department mapRowToDepartment(SqlRowSet results) {
		Department theDepartment = new Department();

		theDepartment.setDepartmentId(results.getLong("department_id"));
		theDepartment.setName(results.getString("name"));
		return theDepartment;
	}

}
