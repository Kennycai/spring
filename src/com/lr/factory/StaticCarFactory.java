package com.lr.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
	private static Map<String, Car>cars = new HashMap<String, Car>();
	
	static {
		cars.put("BMW", new Car("BMW", 500000));
		cars.put("audi", new Car("audi", 200000));
	}
	
	public static Car getCar(String name) {
		return cars.get(name);
	}
}
