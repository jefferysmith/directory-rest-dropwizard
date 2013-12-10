package com.jefferysmith.directory.dropwizard.resources;

import com.jefferysmith.directory.dropwizard.api.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employees/{id}")
public class EmployeeResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeResource.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("id") Long id) {
        LOGGER.debug("GET employee id: " + id);
        Employee employee = new Employee();
        employee.setId(id);
        employee.setBlog("blog");
        employee.setCellPhone("cell-phone");
        employee.setCity("city");
        employee.setDepartment("department");
        employee.setEmail("email");
        employee.setFirstName("firstName");
        employee.setLastName("lastName");
        employee.setOfficePhone("office-phone");
        employee.setPic("pic");
        employee.setTitle("title");
        employee.setTwitterId("twitterId");
        return employee;
    }
}
