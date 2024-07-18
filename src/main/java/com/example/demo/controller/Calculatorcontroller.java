package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.calculatorservice;

@RestController
public class Calculatorcontroller {
	
	@Autowired
	private calculatorservice calculatorService;
	
	@GetMapping("/addition")
	public double add(@RequestParam double a,@RequestParam double b)
	{
		return calculatorService.add(a, b);
	}
	@GetMapping("/subtraction")
	public double sub(@RequestParam double a,@RequestParam double b)
	{
		return calculatorService.sub(a, b);
	}
	@GetMapping("/multiplication")
	public double mul(@RequestParam double a,@RequestParam double b)
	{
		return calculatorService.mul(a, b);
	}
	@GetMapping("/division")
	public double div(@RequestParam double a,@RequestParam double b)
	{
		return calculatorService.div(a, b);
	}

}
