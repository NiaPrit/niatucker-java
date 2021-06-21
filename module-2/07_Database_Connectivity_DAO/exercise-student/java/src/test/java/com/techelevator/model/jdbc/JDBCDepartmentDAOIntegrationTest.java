package com.techelevator.model.jdbc;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import java.sql.SQLException;

public class JDBCDepartmentDAOIntegrationTest {
    private static final String Test_Name = "Department Testing";

    private static SingleConnectionDataSource dataSource; // connection to data source

    private JDBCDepartmentDAO dao; // define reference to the object containing the methods being tested

    @BeforeClass // Enter to instantiate class
    public static void newDataSource() {
        dataSource = new SingleConnectionDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/projectsDAO"); // set datasource connection string
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");
        dataSource.setAutoCommit(false);
    }

    @AfterClass
    public static void closeDataSource() throws SQLException {
     dataSource.destroy();
    }
    Department testDept = createTestDept(Test)









    //Helper Methods

    private Department createTestDept(String name) {
        Department testDept = new Department();
        testDept.setName(name);
        return testDept;

    }

}
