package com.example.limits_service.controller;

import com.example.limits_service.bean.Limits;
import com.example.limits_service.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limit")
    public Limits retrieveLimits(){
       //return new Limits(1000,1);
      return  new Limits(configuration.getMaximum(),configuration.getMinimum());
    }
}
