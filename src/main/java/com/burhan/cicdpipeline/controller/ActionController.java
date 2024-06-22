package com.burhan.cicdpipeline.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/action")
public class ActionController {

    @GetMapping
    public ResponseEntity<String> getAction() {
        return ResponseEntity.ok("Test Github Action");
    }
}
