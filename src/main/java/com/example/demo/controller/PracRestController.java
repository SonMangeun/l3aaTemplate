package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class PracRestController {
	
    @GetMapping("/user")
    public String getUser() {    	
    	// GET 방식으로 사번을 리턴
    	String userId = "82107442"; // 사번
        return userId;
    }
}