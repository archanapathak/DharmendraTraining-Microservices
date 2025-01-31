package com.example.Spring_Security_Demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class SecurityDemoController {
    @GetMapping("/public")
    public String publicEndPoint(){
        return "this is public endpoint";
    }
    @GetMapping("/admin")
    public String adminEndPoint(){
        return "this is admin endpoint";
    }
    @GetMapping("/user")
    public String userEndPoint(){
        return "this is user endpoint";
    }


}
