package com.jefferysmith.directory.dropwizard;

import com.jefferysmith.directory.dropwizard.resources.EmployeeResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class DirectoryService extends Service<ApplicationConfiguration> {

    public static void main(String[] args) throws Exception {
        new DirectoryService().run(args);
    }

    @Override
    public void initialize(Bootstrap<ApplicationConfiguration> applicationConfigurationBootstrap) {
    }

    @Override
    public void run(ApplicationConfiguration applicationConfiguration, Environment environment) throws Exception {
        environment.addResource(new EmployeeResource());
    }
}
