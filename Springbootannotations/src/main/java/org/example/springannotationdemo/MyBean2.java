package org.example.springannotationdemo;

import org.springframework.stereotype.Component;

@Component
public class MyBean2 {

    public MyBean2(){

        System.out.println("MyBean2 instance created");
    }
}
