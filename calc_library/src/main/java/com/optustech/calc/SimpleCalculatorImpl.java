package com.optustech.calc;

public class SimpleCalculatorImpl implements SimpleCalculator {

	public int add(int a, int b) {
		
		return  a + b;
	}

	public int substract(int a, int b) {
	
		return add(a, -1 * b);
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

}
