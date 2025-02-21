package com.bridgeLab.HelloMessageApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloPrint")
    public String UC1(){
        return "Hello BridgeLabz";

    }
    @GetMapping("/hello/query")
    public String UC2(@RequestParam String name){
        return "Hello" + name +" from BridgeLabz";
    }
}
