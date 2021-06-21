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
		List<Department> searchDepartmentsByName = new ArrayList<>();

		String sqlSearchDepartmentByName = "Select * from department " +
				" where name ilike " +
				" ?";

		SqlRowSet searchDepartmentByNameRows = jdbcTemplate.queryForRowSet(sqlSearchDepartmentByName, nameSearch);

		while(searchDepartmentByNameRows.next()) {
			searchDepartmentsByName.add(mapRowToDepartment(searchDepartmentByNameRows));
		}
		return searchDepartmentsByName;
	}




	@Override
	public void saveDepartment(Department updatedDepartment) {
		String updateStatement = "update department " +
				"set name = ? " +
				"where department_id = ?";
		jdbcTemplate.update(updateStatement, updatedDepartment.getName(), updatedDepartment.getDepartmentId());
	}


	@Override
	public Department createDepartment(Department newDepartment) {
	String newDept = "insert into department(name) " +
					 "values (?)";
	newDepartment.setDepartmentId(getNextId());
	jdbcTemplate.update(newDept, newDepartment.getName());

		return newDepartment;
	}


	@Override
	public Department getDepartmentById(Long id) {
		Department wantedDepartment = null;
		String searchDepartmentId = "select * " + "from department " +
				"where id = ?";
		return wantedDepartment;
	}



// helper methods
	private long getNextId() {
		SqlRowSet nextId = jdbcTemplate.queryForRowSet("select nextval('seq_department_id')");
		if(nextId.next()) {
			return nextId.getLong(1);
		} else{
			throw new RuntimeException("No more Departments");
		}
	}

	private Department mapRowToDepartment(SqlRowSet results) {
		Department theDepartment = new Department();

		theDepartment.setDepartmentId(results.getLong("department_id"));
		theDepartment.setName(results.getString("name"));
		return theDepartment;
	}

}
