package com.lr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setName("Spring");
		helloWorld.hello();
	}
}
