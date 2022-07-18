package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class DemoApplication {
	

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		Hello h = ctx.getBean("hello",Hello.class);
		String sr = ((Hello) h).gethello("hi");
		System.out.println(sr);
	}
  
}
