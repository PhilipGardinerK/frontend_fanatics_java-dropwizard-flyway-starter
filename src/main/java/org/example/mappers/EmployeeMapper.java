package org.example.mappers;

import org.example.models.Employee;
import org.example.models.EmployeeResponse;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMapper {

    public static List<EmployeeResponse> mapEmployeeListToEmployeeResponseList(
            final List<Employee> employees) {
        return employees
                .stream()
                .map(employee -> new EmployeeResponse(employee.getEmployeeID(),
                        employee.getRoleID(), employee.getEmployeeFname(),
                        employee.getEmployeeLname(), employee.getBankAcctNo(),
                        employee.getNiNo(), employee.getSalary(),
                        employee.getCommRate()))
                .collect(Collectors.toList());
    }
}