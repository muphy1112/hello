package me.muphy.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String sayHello(String name){
        System.out.println("hello " + name);
        return "hello " + name;
    }
}
