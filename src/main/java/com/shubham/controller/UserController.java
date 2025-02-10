package com.shubham.controller;

import com.shubham.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    String getMsg(HttpServletRequest request){
        return "Welcome to spring security  "+request.getSession().getId();

    }


}
