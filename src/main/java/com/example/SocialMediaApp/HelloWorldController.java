package com.example.SocialMediaApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/hello-world")
    public String saySomething(){
//        System.out.println("!!Hello World!!");
        return "Hello World";
    }
}
