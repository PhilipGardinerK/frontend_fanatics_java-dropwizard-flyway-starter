package org.example.controllers;

import io.swagger.annotations.Api;
import org.example.Exceptions.FailedToCreateException;
import org.example.Exceptions.InvalidException;
import org.example.models.EmployeeRequest;
import org.example.services.EmployeeService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Api("Frontend_Fanatics_Employee")
@Path("/api/employees")
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(final EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createEmployee(final EmployeeRequest employeeRequest) {
        try {
            return Response
                    .status(Response.Status.CREATED)
                    .entity(employeeService.createEmployee(employeeRequest))
                    .build();
        } catch (SQLException | FailedToCreateException e) {
            System.out.println(e.getMessage());
            return Response.serverError().build();
        } catch (InvalidException e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage()).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployees() {
        try {
            return Response.ok().entity(employeeService.getAllEmployees())
                    .build();
        } catch (SQLException e) {
            return Response.serverError().build();
        }
    }
}
