package org.example.daos;

import org.example.models.Employee;
import org.example.models.EmployeeRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public int createEmployee(final EmployeeRequest employeeRequest)
            throws SQLException {
        Connection c = DatabaseConnector.getConnection();

        String insertStatement =
                "INSERT INTO Employee (roleID,employeeFname, employeeLname, "
                        + "bankAcctNo, niNo, salary, commRate) "
                        + "VALUES (?,?,?,?,?,?,?);";

        PreparedStatement st = c.prepareStatement(insertStatement,
                Statement.RETURN_GENERATED_KEYS);

        st.setInt(1, employeeRequest.getRoleID());
        st.setString(2, employeeRequest.getEmployeeFname());
        st.setString(3, employeeRequest.getEmployeeLname());
        st.setString(4, employeeRequest.getBankAcctNo());
        st.setString(5, employeeRequest.getNiNo());
        st.setDouble(6, employeeRequest.getSalary());
        st.setDouble(7, employeeRequest.getCommRate());

        st.executeUpdate();

        ResultSet rs = st.getGeneratedKeys();

        if (rs.next()) {
            return rs.getInt(1);
        }

        return -1;
    }

    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> employees = new ArrayList();

        try (Connection connection = DatabaseConnector.getConnection()) {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM "
                    + "Employee WHERE RoleID = 2;");

            while (resultSet.next()) {
                Employee employee = new Employee(
                        resultSet.getInt("employeeID"),
                        resultSet.getInt("roleID"),
                        resultSet.getString("employeeFname"),
                        resultSet.getString("employeeLname"),
                        resultSet.getString("bankAcctNo"),
                        resultSet.getString("niNo"),
                        resultSet.getDouble("salary"),
                        resultSet.getDouble("commRate"));
                employees.add(employee);
            }
        }
        return employees;
    }
}

