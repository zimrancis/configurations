package com.ciphersnippet.demo.controller;

import com.ciphersnippet.demo.config.DbSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${my.greeting: default value}")
    private String greetingMessage;

    @Value("{some.static.message}")
    private String staticMessage;

    @Value("${my.list.values}")
    private String listValues;

    @Autowired
    private DbSettings dbSettings;

    @Autowired
    private Environment env;

    public ConfigController() {

    }

    @GetMapping("/greeting")
    public String greeting() {
        return "my.greeting " + greetingMessage + " my.list.values " + listValues + " db.connection" + dbSettings.getConnection();
    }

    @GetMapping("/envdetails")
    public String envDetails() { return env.toString(); }
}
