package com.fujitsu.controller;

import com.fujitsu.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * UserController
 */
@RestController
@RequestMapping( value = "/user", produces = "application/json")
public class UserController {

    @PostMapping("/login")
    public String login(
            @RequestBody User user){

//        System.out.println(queryString);
//        System.out.println(username);
//        System.out.println(password);
        System.out.println(user);
        return "user";
    }
}
