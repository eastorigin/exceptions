package com.ktdsuniversity.edu.exceptions.calculator;

public class Calculator implements CalculatorInterface {
	
	@Override
	public double calculate(String operator, double number1, double number2) {
		if(operator.equals("+") ) {
			return number1 + number2;
		}else if(operator.equals("-") ) {
			return number1 - number2;
		}else if(operator.equals("*") ) {
			return number1 * number2;
		}else if(operator.equals("/")) {
			if(number2 == 0) {
				throw new ErrorDivideException("0으로 나눌 수 없습니다");
			}
			return number1 / number2;
		}else {
			throw new ErrorOperatorException("잘못된 요청입니다. 연산 기호를 정확히 입력하세요.");
		}
	}
	
	@Override
	public void checkOperator(String operator) {
		if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
			throw new ErrorOperatorException("잘못된 요청입니다. 연산 기호를 정확히 입력하세요.");
		}
	}
}
