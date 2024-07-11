package org.example.services;

import org.example.Exceptions.Entity;
import org.example.Exceptions.FailedToCreateException;
import org.example.Exceptions.InvalidException;
import org.example.Validators.EmployeeValidator;
import org.example.daos.DatabaseConnector;
import org.example.daos.EmployeeDao;
import org.example.mappers.EmployeeMapper;
import org.example.models.Employee;
import org.example.models.EmployeeRequest;
import org.example.models.EmployeeResponse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    EmployeeDao employeeDao;

    EmployeeValidator employeeValidator;

    public EmployeeService(final EmployeeDao employeeDao,
                           final EmployeeValidator employeeValidator) {
        this.employeeDao = employeeDao;
        this.employeeValidator = employeeValidator;
    }

    public int createDeliveryEmployee(
            final EmployeeRequest employeeRequest)
            throws FailedToCreateException, SQLException, InvalidException {
        employeeValidator.validateEmployee(employeeRequest);

        int id = employeeDao.createDeliveryEmployee(employeeRequest);

        if (id == -1) {
            throw new FailedToCreateException(Entity.EMPLOYEE);
        }

        return id;
    }

    public List<EmployeeResponse> getAllEmployees()
            throws SQLException {
        return EmployeeMapper.mapEmployeeListToEmployeeResponseList(
                employeeDao.getAllDeliveryEmployees());
    }
}
