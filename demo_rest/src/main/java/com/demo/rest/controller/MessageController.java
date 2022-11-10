package com.demo.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/view")
    public ResponseEntity<String> getMessage(){
        String message = "{\"message\":\"Hello angular..\"}";
        System.out.println("Request processed..");
        return ResponseEntity.ok(message);
    }


}
