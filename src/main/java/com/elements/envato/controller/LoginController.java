package com.elements.envato.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
    @GetMapping(value = {"/", "/login"})
    public ModelAndView getLoginPage(ModelAndView model) {
        model.setViewName("index");
        return model;
    }

    @GetMapping(value = "/home")
    public ModelAndView getHomePage(ModelAndView model) {
        model.setViewName("index");
        return model;
    }

}
