package com.example.lombokEx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningUsingHeader {
    @GetMapping(value ="/person/header",headers ="X-API-VERSION=1")
    public PersonV1 personV1(){
        return new PersonV1("Archana Pathak");
    }

    @GetMapping(value ="/person/header",headers ="X-API-VERSION=2")
    public PersonV2 personV2(){
        return new PersonV2(new Name("Tom","cruise"));
    }
}
