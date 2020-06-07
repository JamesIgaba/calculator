package com.heartbeat.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int addition(int x, int y) {
		return x + y;
	}
	
	public int subtraction(int x, int y) {
		return x - y;
	}
	
	public int multiplication(int x, int y) {
		return x * y;
	}
	
	public double division(int x, int y) {
		return x /(double) y;
	}
}
