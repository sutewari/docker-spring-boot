package com.sutewari.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloSpringBoot {

    @GetMapping
    public String hello (){
        return "Welcome to Spring boot Docker Hello World! Auto Docker Build Test";
    }
}
