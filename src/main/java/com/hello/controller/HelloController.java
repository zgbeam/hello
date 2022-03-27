package com.hello.controller;

import com.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author smile
 */
@Controller
public class HelloController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/hello")
    public Long hello() {
        return userService.hello();
    }
}
