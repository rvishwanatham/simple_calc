package com.optustech.calc;

public class SimpleCalculatorApplication {

	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculatorImpl();
		System.out.println("calc::Add(10,20)=" + calc.add(10,20));
	}

}
