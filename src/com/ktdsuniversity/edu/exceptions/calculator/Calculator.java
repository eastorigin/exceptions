package com.ktdsuniversity.edu.exceptions.calculator;

public class Calculator implements CalculatorInterface {

	private int number1;
	private int number2;
	private String operator;
	
	public Calculator(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	@Override
	public void add(String operator, int num1, int num2) {
		if(operator.equals("+")) {
			System.out.println(num1 + num2);
		}
	}
	
	@Override
	public void substract(String operator, int num1, int num2) {
		if(operator.equals("-")) {
			System.out.println(num1 - num2);
		}
	}
	
	@Override
	public void multiple(String operator, int num1, int num2) {
		if(operator.equals("*")) {
			System.out.println(num1 * num2);
		}
	}
	
	@Override
	public void divide(String operator, int num1, int num2) {
		if(operator.equals("/")) {
			System.out.println(num1 * num2);
		}
	}
}
