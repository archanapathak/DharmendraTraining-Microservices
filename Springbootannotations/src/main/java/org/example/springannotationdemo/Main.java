package org.example.springannotationdemo;

import org.example.springannotationdemo.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.register(Config.class);
//        ctx.refresh();
//        MyBean mb1 = ctx.getBean(MyBean.class);
//        System.out.println(mb1.hashCode());
//        MyBean mb2 = ctx.getBean(MyBean.class);
//        System.out.println(mb2.hashCode());
//        ctx.close();

        //ApplicationContext ctx = SpringApplication.run(Main.class);

//       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.register(Config.class);
//        ctx.refresh();
//
//        MyBean mb1 = ctx.getBean(MyBean.class);
//        System.out.println(mb1.hashCode());
//        MyBean mb2 = ctx.getBean(MyBean.class);
//        System.out.println(mb2.hashCode());

       ConfigurableApplicationContext context = SpringApplication.run(Main.class);
       //PizzaController pizzaController = context.getBean(PizzaController.class);
//System.out.println(pizzaController.getPizza());
        context.close();
    }
}