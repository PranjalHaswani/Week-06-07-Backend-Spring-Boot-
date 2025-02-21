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
}
