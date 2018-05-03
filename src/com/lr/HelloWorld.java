package com.lr;

public class HelloWorld {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}
	
	public void hello() {
		System.out.println("hello:" + name);
	}
	public HelloWorld() {
		System.out.println("HelloWorld");
	}
}
