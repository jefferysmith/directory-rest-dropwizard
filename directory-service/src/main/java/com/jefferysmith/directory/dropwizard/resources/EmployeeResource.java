package com.jefferysmith.directory.dropwizard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("employees/{id}")
public class EmployeeResource {
    @GET
    public String getEmployee(@PathParam("id") Long id) {
        return "GET Employee id: " + id;
    }
}
