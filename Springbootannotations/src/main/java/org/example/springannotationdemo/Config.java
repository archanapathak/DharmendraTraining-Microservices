package org.example.springannotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
   @Scope(value="prototype")
    public MyBean myBean(){
        return new MyBean();
    }


}
