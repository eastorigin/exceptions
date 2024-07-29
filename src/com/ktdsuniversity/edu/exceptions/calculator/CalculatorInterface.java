package com.ktdsuniversity.edu.exceptions.calculator;

public interface CalculatorInterface {
	
	double calculate(String operator, double number1, double number2);
	void checkOperator(String operator);
	}