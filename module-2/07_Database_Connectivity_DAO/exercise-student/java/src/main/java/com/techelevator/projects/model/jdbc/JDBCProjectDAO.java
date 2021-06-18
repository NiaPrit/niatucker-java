package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Project> getAllActiveProjects() {


		return new ArrayList<>();
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String sqlDeleteEmployeeFromProject = "delete from project_employee where " +
				 							  "project_id = ? and employee_id = ?";
		jdbcTemplate.update(sqlDeleteEmployeeFromProject, projectId, employeeId);
		
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		
	}


	private Project mapRowToProject(SqlRowSet results) {
		Project theProject = new Project();

		theProject.setProjectId(results.getLong("project_id"));
		theProject.setName(results.getString("name"));
		theProject.setFromDate(results.get("from_date"));
		return theProject;
	}

}
