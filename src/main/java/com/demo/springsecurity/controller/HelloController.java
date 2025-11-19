package com.demo.springsecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest req) {
        return "Hello, World!" + "" + req.getSession().getId();
    }

    @GetMapping("/admin")
    public String admin(HttpServletRequest req) {
        return "Hello, Admin!" + ""+ req.getSession().getId();
    }
}
