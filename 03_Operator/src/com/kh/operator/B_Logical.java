package com.kh.operator;

import java.util.Scanner;

public class B_Logical {
	
	/*
	 * 논리 연산자 : 논리 값 두개를 비교하는 연산자
	 * 
	 * AND && : a && b -> a와 b가 모두 참(true)일 경우에만 true 반환.
	 * 			둘 중 하나라도 false 값이 들어간 경우 false 반환.
	 * OR || : a || b -> a와 b 모두 거짓인 경우에만 false 반환.
	 * 			둘 중 하나라도 true 값이 들어간 경우 true 반환.
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		// Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력해 주세요 : ");
		int num = sc.nextInt();
		
		// num의 값이 0보다 크면서, 짝수입니까?
		boolean result = (num > 0) && (num % 2 == 0);
		
		System.out.println("num이 0보다 크면서, 짝수입니까 ? " + result);
		
	}
	
	public void method2() {
		
		System.out.println("정수를 입력 : ");
		int num = sc.nextInt();
		
		boolean result = (num >= 1) && (num <= 100);
		
		System.out.println("num이 1 이상 100 이하입니까 ? " + result);
		
		
	}
	
	public void method3() {
		
		// 사용자가 입력한 값이 'y' 혹은 'Y'인 경우 True, 아니면 False
		
		System.out.println("계속 진행하시려면 y를 입력해 주세요 : ");
		
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		
		System.out.println(result);
		
	}
	
	public void method4() {
		
		int num1 = 10;
		// ++ -> num1이 가진값을 1 증가 시키는 단항연산자
		// and 연산자의 경우 A && B 조건중 A의 값이 false 인 경우 뒤 쪽 조건들은 "무조건" false 이기 때문에 뒤쪽 조건식은 실행되지도 않는다. (shortcut expression, 지름길)
		boolean result1 = (num1 < 5) && (num1++ > 0);
		
		System.out.println("result1 : " + result1); // false
		System.out.println("num1 : " + num1); // 10 
		
		int num2 = 10;
		// or 연산자는 A || B 중 A가 참일 경우 뒤 쪽 조건식은 검사하지 않고 참을 반환.
		boolean result2 = (num2 < 20) || (++num2 > 0);
		// result2 --> true,
		// num2 -> 10;
	}
	
}






























