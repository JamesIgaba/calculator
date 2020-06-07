package com.heartbeat.calculator.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.heartbeat.calculator.service.CalculatorService;

public class CalculatorTests {

	CalculatorService calculatorService = new CalculatorService();
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void additionTest() {
		assertEquals(7, calculatorService.addition(4, 3));
	}
	
	@Test
	void subtractionTest() {
		assertEquals(1, calculatorService.subtraction(4, 3));
	}
	
	@Test
	void multiplicationTest() {
		assertEquals(21, calculatorService.multiplication(7, 3));
	}
	
	@Test
	void divisionTest() {
		assertEquals(3, calculatorService.division(9, 3));
	}

}
