package com.ciphersnippet.org.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Data
@Configuration
@ConfigurationProperties("db")
public class DbSettings {
    /*private String connection;
    private String host;
    private int port;*/
    private Map<String,String> connection;
    private String host;
    private int port;
}
