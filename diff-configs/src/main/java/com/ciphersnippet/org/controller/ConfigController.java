package com.ciphersnippet.org.controller;

import com.ciphersnippet.org.config.DbSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("Hello Spring Boot")
    private String greetingMessage;

    /*@Value("${app.greeting}")
    private String sayHi;*/

    @Value("${my.love}")
    private String love;

    @Value("${my.list.values}")
    private String myList;

    /*@Value("#{${dbValues}}")
    private Map<String,String> myMap;*/

    @Autowired
    private DbSettings dbSettings;

    @Autowired
    private Environment env;

    @GetMapping("/greeting")
    public String showMe() {
        return greetingMessage+" "+love+" "+myList+" "/*+myMap*/+" Connection:"+dbSettings.getConnection()+" Port:"+dbSettings.getPort();
    }

    @GetMapping("/envdetails")
    public String envDetails() {
        return env.toString();
    }
}
