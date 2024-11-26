package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomController {
	
	@GetMapping("/hello")
    public String welcome() {
        return "Hello, Welcome to Azure DevOps!";
    }

}
