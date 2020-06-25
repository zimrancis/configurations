package com.ciphersnippet.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MultiPropertiesConfiguration {

    @Autowired
    private Environment environment;

    public String getMyListValues() {
        return environment.getProperty("my.list.values");
    }
    public String getMyConnection() {
        return environment.getProperty("db.connection");
    }
    public String getDbHost() {
        return environment.getProperty("db.host");
    }
    public String getPort() {
        return environment.getProperty("db.port");
    }

}
