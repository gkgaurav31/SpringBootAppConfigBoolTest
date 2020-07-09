package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    private final MessageProperties properties;

    public HelloController(MessageProperties properties) {
        this.properties = properties;
    }

    @GetMapping
    public String getMessage() {
        return "Message: " + properties.getMessage();
    }
    
    @GetMapping("/bool1")
    public String getBoolMessage2() {
    	return "isEnable: " +  properties.isEnable();
    }
    
    @GetMapping("/bool2")
    public String getBoolMessage3() {
    	return "isenabletest " +  properties.isIsenabletest();
    }
    
}