package com.ciphersnippet.demo.controller;

import com.ciphersnippet.demo.config.MultiPropertiesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestProfileController {

    @Autowired
    private MultiPropertiesConfiguration multiPropertiesConfiguration;

    @RequestMapping("/rest-profile")
    public MultiPropertiesConfiguration getConfiguration() {
        return multiPropertiesConfiguration;
    }
}
