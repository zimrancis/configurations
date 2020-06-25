package com.ciphersnippet.demo.controller;

import com.ciphersnippet.demo.config.MultiPropertiesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
public class ProfileController {

    @Autowired
    private MultiPropertiesConfiguration multiProfilesConfiguration;

    @RequestMapping("/profile")
    public String getConfiguration( Model model) {
        model.addAttribute("values", multiProfilesConfiguration.getMyListValues());
        model.addAttribute("connection", multiProfilesConfiguration.getMyConnection());
        model.addAttribute("host", multiProfilesConfiguration.getDbHost());
        model.addAttribute("port", multiProfilesConfiguration.getPort());

        return "mprofile";
    }

/*    @RequestMapping("/profile")
    public MultiPropertiesConfiguration getConfiguration() {
        return multiPropertiesConfiguration;
    }*/
}
