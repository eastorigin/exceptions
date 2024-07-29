package com.ktdsuniversity.edu.exceptions;

import java.util.Scanner;

public class ScannerExceptionTest {

	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// 1. 사용자가 문자를 입력하면 숫자로 변경하는 코드
		String str = keyboard.nextLine();
		int number = Integer.parseInt(str);
		System.out.println(number);
		
		// 2. 숫자를 입력받는 코드에 문자를 쓰면?
		String numberString = keyboard.nextInt() + ""; // 숫자에 문자열을 더하면 문자열이 된다
		System.out.println(numberString);
	}
}
