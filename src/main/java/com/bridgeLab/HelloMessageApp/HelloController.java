package com.bridgeLab.HelloMessageApp;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/helloPrint")
    public String UC1(){
        return "Hello BridgeLabz";
    }
    @GetMapping("/hello/query")
    public String UC2(@RequestParam String name) {
        return "Hello" + name + " from BridgeLabz";
    }
    @GetMapping("/hello/param/{name}")
    public String UC3(@PathVariable("name") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("hello/post")
    public String UC4(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
    @PutMapping("hello/put/{firstName}")
    public String UC5(@PathVariable String firstName, @RequestParam(required = false) String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            return "Error: lastName query parameter is required!";
        }
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
    }
