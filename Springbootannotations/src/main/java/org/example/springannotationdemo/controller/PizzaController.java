package org.example.springannotationdemo.controller;

import org.springframework.stereotype.Component;

@Component
public class PizzaController {
    public String getPizza(){
        return "hot pizza";
    }
}
