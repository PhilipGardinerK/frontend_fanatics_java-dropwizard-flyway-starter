package org.example.daos;

import org.example.models.EmployeeRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {

    public int createDeliveryEmployee(final EmployeeRequest employeeRequest)
            throws SQLException {
        Connection c = DatabaseConnector.getConnection();

        String insertStatement =
                "INSERT INTO Employee (roleID,employeeFname, employeeLname, "
                        + "bankAcctNo, niNo, salary, commRate) "
                        + "VALUES (2,?,?,?,?,?,?);";

        PreparedStatement st = c.prepareStatement(insertStatement,
                Statement.RETURN_GENERATED_KEYS);

        st.setString(1, employeeRequest.getEmployeeFname());
        st.setString(2, employeeRequest.getEmployeeLname());
        st.setString(3, employeeRequest.getBankAcctNo());
        st.setString(4, employeeRequest.getNiNo());
        st.setDouble(5, employeeRequest.getSalary());
        st.setDouble(6, employeeRequest.getCommRate());

        st.executeUpdate();

        ResultSet rs = st.getGeneratedKeys();

        if (rs.next()) {
            return rs.getInt(1);
        }

        return -1;
    }
}

