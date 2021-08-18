package com.java.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class UserController {


    @RequestMapping(value = "/api/v1/test", method = RequestMethod.GET)
    //@GetMapping("/api/v1/test")
    public ResponseEntity<?> getInfo() {
        return ResponseEntity.ok("hello");


    }
}
