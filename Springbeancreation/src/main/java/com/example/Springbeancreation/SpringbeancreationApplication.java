package com.example.Springbeancreation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbeancreationApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbeancreationApplication.class, args);

//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
//		HelloWorld bean =  (HelloWorld) context.getBean("hello");
//		System.out.println(bean.getMessage());
//		context.close();
//
//		ApplicationContext context2 = new ClassPathXmlApplicationContext("Bean.xml");
//		Student student = (Student) context2.getBean("Student");
//		System.out.println(student);


		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld2 objectA =  (HelloWorld2) context.getBean("hello2");
		objectA.setMessage("this is objectA message");
		System.out.println(objectA.getMessage());

		HelloWorld2 objectB =  (HelloWorld2) context.getBean("hello2");
		//objectB.setMessage("this is objectB message");
		System.out.println(objectB.getMessage());





	}

}
