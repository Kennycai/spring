package com.lr.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
		
		Calculator calculator = (Calculator)ctx.getBean("calculatorImpl");
		
		double result = calculator.add(1, 2);
		System.out.println("result:" + result);
		
		result = calculator.div(10, 0);
		System.out.println("result:" + result);
	}
}
