package com.lr.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
	private Map<String, Car>cars = new HashMap<String, Car>();
	
	public InstanceCarFactory() {
		// TODO Auto-generated constructor stub
		cars.put("BMW", new Car("BMW", 500000));
	}
	
	public Car getCar(String name) {
		return cars.get(name);
	}
}
