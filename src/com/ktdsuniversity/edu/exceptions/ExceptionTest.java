package com.ktdsuniversity.edu.exceptions;

public class ExceptionTest {

	/**
	 * 숫자 형태가 아닌 문자들을 숫자로 바꾸려 할 때 발생 예외 (오류)
	 * 형변환을 할 때 발생
	 * Byte.parseByte("ABC");
	 * Short.parseShort("ABCD");
	 * Integer.parseInt("ABCD");
	 * Long.parseLong("AAAA");
	 * Float.parseFloat("AAA");
	 * Double.parseDouble("AADSFD");
	 */
	public static void numberFormatException(String age) {
		int iAge = 0;
		if (age.matches("^[0-9]+$")) {
			iAge = Integer.parseInt(age);			
		}
		
		System.out.println(iAge);
	}
	
	/**
	 * 배열에서만 발생하는 예외 (오류)
	 * 배열의 인덱스 범위를 벗어났을 경우
	 * int[] numbers = new int[1];
	 * number[-1]; > ArrayIndexOutOfBoundsException
	 * number[2]; > ArrayIndexOutOfBoundsException
	 */
	public static void arrayIndexOutOfBoundsException(int index, int value) {
		int[] numbers = new int[10];
		// numbers index : 0 ~ 9
		// 접근가능한 인덱스: 0 ~ 9 <-- 인덱스의 범위
		
		// numbers.length = 10;
		// index = 11;
		if (index >= 0 && index < numbers.length) {
			numbers[index] = value;			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	/**
	 * ReferenceType에서만 발생하는 예외 (오류)
	 * Null 인스턴스에게 접근하려는 경우
	 * null.??? > NullPointerException 발생!
	 */
	public static void nullPointerException() {
		String name = null;
		
		int length = 0;
		if (name != null) {
			length = name.length(); // <-- NullPointerExcepton 발생!			
		}
		
		System.out.println("name 문자열의 길이는 " + length + "입니다");
	}
	
	public static void main (String[] args) {
		
		System.out.println("널포인터 예외 실습");
		nullPointerException();
		
		System.out.println("인덱스 예외 실습");
		arrayIndexOutOfBoundsException(0, 100);
		arrayIndexOutOfBoundsException(1, 200);
		arrayIndexOutOfBoundsException(11, 300); // if 처리에 의해 무시
		arrayIndexOutOfBoundsException(-1, 300);
		arrayIndexOutOfBoundsException(2, 400);
		
		System.out.println("숫자 변환 예외 실습");
		numberFormatException("30");
		numberFormatException("30.123");
		numberFormatException("서른");
		numberFormatException("thirty");
		
		// IS A 관계
		// Student is a Person
		Person person1 = new Person();
		Person person2 = new Student();
		
		// Person is not a Student
		// Exception: 개발자가 작성한 코드에서 로직에는 문제가 없으나 참조값에 따라서 발생하는 에러
		//				개발자가 스스로 처리할 수 있음
		// Error: JVM에서 발생하는 에러.
		// 			로직 자체가 잘못된 케이스
		// 			만약, 로직에는 문제가 없는데 Error가 발생했다!
		//			개발자는 처리 X
		//			JDK를 유지보수하는 팀에게 버그를 보고
		Student person3 = (Student) person2;
		
		// int => Intger => String
		// Primitive Type => Reference Type => Other Reference Type
		// 숫자 0을 문자로 변경해서 Object에 할당하는 코드
		Object x = Integer.valueOf(0);
		
		if(x instanceof String) {
			// 오브젝트 타입 x를 String으로 명시적 형변환 시도
			System.out.println((String)x);			
		}
		
		// x는 String의 타입인가?
	}
}
