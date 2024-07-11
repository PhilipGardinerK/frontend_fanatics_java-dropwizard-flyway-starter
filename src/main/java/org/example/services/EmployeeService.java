package org.example.services;

import org.example.Exceptions.Entity;
import org.example.Exceptions.FailedToCreateException;
import org.example.Exceptions.InvalidException;
import org.example.Validators.EmployeeValidator;
import org.example.daos.EmployeeDao;
import org.example.models.EmployeeRequest;

import java.sql.SQLException;

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
}
