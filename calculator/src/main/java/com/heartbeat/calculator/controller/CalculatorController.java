package com.heartbeat.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heartbeat.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

	@Autowired
	public CalculatorService calcService;
	
	@PostMapping(value ="/add/{x}/{y}")
	public int add(@PathVariable int x, @PathVariable int y) {
		return calcService.addition(x, y); 
	}
	
	@PostMapping(value ="/subtract/{x}/{y}")
	public int subtract(@PathVariable int x, @PathVariable int y) {
		return calcService.subtraction(x, y); 
	}
	
	@PostMapping(value ="/multiply/{x}/{y}")
	public int multiply(@PathVariable int x, @PathVariable int y) {
		return calcService.multiplication(x, y); 
	}
	
	@PostMapping(value ="/divide/{x}/{y}")
	public double divide(@PathVariable int x, @PathVariable int y) {
		return calcService.division(x, y); 
	}
}
