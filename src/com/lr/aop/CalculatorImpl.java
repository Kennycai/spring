package com.lr.aop;

import org.springframework.stereotype.Component;

@Component()
public class CalculatorImpl implements Calculator{

	@Override
	public double add(int a, int b) {
		// TODO Auto-generated method stub
		double result = a+b;
		return result;
	}

	@Override
	public double div(int a, int b) {
		// TODO Auto-generated method stub
		double result = a/b;
		return result;
	}

}
