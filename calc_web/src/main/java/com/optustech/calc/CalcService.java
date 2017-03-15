package com.optustech.calc;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
	
	SimpleCalculator simpleCalculator = new SimpleCalculatorImpl();
	
	public int add(int a, int b) {
		return simpleCalculator.add(a,b);
	}
	
	public int substract(int a, int b) {
		return simpleCalculator.substract(a,b);
	}

	public int multiply(int a, int b) {
		return simpleCalculator.multiply(a,b);
	}

	public int divide(int a, int b) {
		return simpleCalculator.divide(a,b);
	}
}
