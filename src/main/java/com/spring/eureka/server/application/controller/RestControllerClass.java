package com.spring.eureka.server.application.controller;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {




    @GetMapping(value = "/v1/greet",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> greet(){
        return new ResponseEntity<>("hello this is spring boot application running on ecs", HttpStatusCode.valueOf(200));
    }

    @GetMapping(value = "/v1/greet{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> greetWithName(String name){
        return new ResponseEntity<>("hello "+name+" this is spring boot application running on ecs", HttpStatusCode.valueOf(200));
    }
}
