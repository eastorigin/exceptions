package com.ktdsuniversity.edu.exceptions.custom;

import java.util.Scanner;

public class Site {

	public static void main(String[] args) { // main 입력하고 Ctrl + space
		
		MemberRegister register = new MemberRegister();
		
		Scanner keyboard = new Scanner(System.in);
		
		Member member = new Member("sdw", "신동원", null);
		Member member2 = new Member("sdw", null, null);
		
		boolean registResult = false;
		try {
			registResult = register.regist(member);			
		}
		catch(EmptyRegistInfoException erie) {
			System.out.println(erie.getMessage());
			System.out.println("가입 정보를 올바르게 채워주세요");
			System.out.println("가입버튼 누르고 아이디 중복 확인도 빠짐없이 확인해주세요");
		}
		catch(IdRequiredException ire) {
			System.out.println(ire.getMessage());
		}
		catch(UserNameRequiredException unre) {
			System.out.println(unre.getMessage());
		}
		catch(PasswordRequiredException pre) {
			System.out.println(pre.getMessage());
		}
		
		System.out.println(registResult);
	}
}
