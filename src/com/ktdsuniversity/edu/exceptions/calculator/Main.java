package com.ktdsuniversity.edu.exceptions.calculator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		while (true) {
			System.out.println("계산기가 작동합니다");
			System.out.println("원하는 연산기호를 입력하십시오 (+ , - , * , / )");
			System.out.println("종료를 원할시 exit를 입력하십시오");
			String operator = keyboard.nextLine();
			
			if(operator.equals("exit")) {
				System.out.println("계산기 종료");
				break;
			}
			try {
				calculator.checkOperator(operator);
				System.out.println("첫 번째 숫자를 입력하십시오");
				double number1 = keyboard.nextDouble();// public static keyboard(scanner)
				System.out.println("두 번째 숫자를 입력하십시오");
				double number2 = keyboard.nextDouble();
				keyboard.nextLine();
				double result = calculator.calculate(operator, number1, number2);
				System.out.println(result);
			} catch (ErrorDivideException ede) {
				System.out.println(ede.getMessage());
			} catch (ErrorOperatorException eoe) {
				System.out.println(eoe.getMessage());
			}
		}
		
//		while(true) {
//			 public static keyboard(scanner) {
//				 try {
//					 return nextDouble()
//				 }
//				 catch {
//					 inputMismatch
//					 sout 
//					 keyboard.next()
//				 }
//			 }
//		}
	}

}
