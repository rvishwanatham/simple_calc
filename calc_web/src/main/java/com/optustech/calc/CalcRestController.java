package com.optustech.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcRestController {
	
	// field injections are discouraged ?? need to verify 
	@Autowired
	CalcService calcService;
	
//	public CalcRestController(CalcService calcService) {
//		this.calcService = calcService;
//	}
	
	@RequestMapping("/add")
	int add(@RequestParam(value="a", defaultValue="200") int a, @RequestParam(value="b", defaultValue="100") int b) {
		return calcService.add(a, b);
	}
	
	@RequestMapping("/substract")
	int substract(@RequestParam(value="a", defaultValue="200") int a, @RequestParam(value="b", defaultValue="100") int b) {
		return calcService.substract(a, b);
	}
	
	@RequestMapping("/multiply")
	int multiply(@RequestParam(value="a", defaultValue="20") int a, @RequestParam(value="b", defaultValue="10") int b) {
		return calcService.multiply(a, b);
	}
	
	@RequestMapping("/divide")
	int divide(@RequestParam(value="a", defaultValue="20") int a, @RequestParam(value="b", defaultValue="10") int b) {
		return calcService.divide(a, b);
	}
}
