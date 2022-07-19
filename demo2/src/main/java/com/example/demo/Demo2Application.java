package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Demo2Application.class, args);
		
		add a1 = context.getBean(add.class);
//		a1.show();
		int x;
		x = a1.addition(10,12);
		System.out.println(x);
	}

}
