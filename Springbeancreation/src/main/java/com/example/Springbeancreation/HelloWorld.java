package com.example.Springbeancreation;

public class HelloWorld {

    String message;

    public HelloWorld() {
    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }

    public void init() {
        System.out.println("this will initialize my startup operation");

    }

    public  void destroy(){
        System.out.println("this will destroy the bean");
    }
}
