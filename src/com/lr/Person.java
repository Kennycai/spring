package com.lr;

import java.util.List;
import java.util.Map;

public class Person {
	private String name;
	private int age;
	private Car car;
	private Map<String, Car> cars;
	private List<Car> carList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	
	public List<Car> getCarList() {
		return carList;
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + ", cars=" + cars + ", carList=" + carList
				+ "]";
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Person(String name, int age, Car car, Map<String, Car> cars, List<Car> carList) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
		this.cars = cars;
		this.carList = carList;
	}

}
