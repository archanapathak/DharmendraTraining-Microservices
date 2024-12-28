package com.example.Springbeancreation;

public class HelloWorld2 {

    String message;

    public HelloWorld2(String message) {
        this.message = message;
    }

    public HelloWorld2() {
    }

    public String getMessage() {
        return   "your message "+message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
