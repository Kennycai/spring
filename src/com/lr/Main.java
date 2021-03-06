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
		
		Person person1 = (Person)ctx.getBean("person1");
		System.out.println(person1);
		
		Person person2 = (Person)ctx.getBean("person2");
		System.out.println(person2);
		
		Person person3 = (Person)ctx.getBean("person3");
		System.out.println(person3);
		
		person3 = (Person)ctx.getBean("person5");
		System.out.println(person3);
		
		Person person6 = (Person)ctx.getBean("person6");
		System.out.println(person6);
	}
	
}
