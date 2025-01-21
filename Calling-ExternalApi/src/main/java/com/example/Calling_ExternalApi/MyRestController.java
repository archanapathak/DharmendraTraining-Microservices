package com.example.Calling_ExternalApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/controller")
public class MyRestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    //internal api

    @GetMapping(value = "callhelloclient")
    public String getHelloClient(){
        String uri = "http://localhost:8080/controller/welcome";

        RestTemplate template = new RestTemplate();
        String result = template.getForObject(uri, String.class);
        return result;
    }

    //external  api
    @GetMapping(value = "callexternalapi")
    public String getexternalClient(){
        String uri = "https://countriesnow.space/api/v0.1/countries";

        RestTemplate template = new RestTemplate();
        String result = template.getForObject(uri, String.class);
        return result;
    }
}
