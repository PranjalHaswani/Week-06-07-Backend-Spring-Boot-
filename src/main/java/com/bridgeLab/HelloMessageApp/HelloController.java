package com.bridgeLab.HelloMessageApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloPrint")
    public String UC1(){
        return "Hello BridgeLabz";
    }
}
