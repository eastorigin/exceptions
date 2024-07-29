package com.ktdsuniversity.edu.exceptions.calculator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		while (true) {
			System.out.println("계산기가 작동합니다");
			System.out.println("원하는 연산기호를 입력하십시오 (+ , - , * , / )");
			System.out.println("종료를 원할시 exit를 입력하십시오");
			String operator = keyboard.nextLine();
			
			if(operator.equals("exit")) {
				System.out.println("계산기 종료");
				break;
			}else {
				System.out.println("첫 번째 숫자를 입력하십시오");
				int number1 = keyboard.nextInt();
				System.out.println("두 번째 숫자를 입력하십시오");
				int number2 = keyboard.nextInt();
				Calculator calculator = new Calculator(number1, number2);
				keyboard.nextLine();
			}
		}
	}

}
