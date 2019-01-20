package com.fujitsu.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    public String login(String username, String password, HttpServletRequest request) {
        String queryString = request.getQueryString();
        System.out.println(queryString);
        System.out.println(username);
        System.out.println(password);
        return username + password;
    }
}
