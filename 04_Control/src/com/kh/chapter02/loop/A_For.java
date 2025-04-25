package com.kh.chapter02.loop;

public class A_For {
	/*
	 * <반복문>
	 * - 실행할 코드를 반복적으로 수행시켜줌.
	 * - for 문과 while 문으로 나뉨.
	 * [표현법]
	 * for (초기식; 조건식; 증감식) {
	 *     반복으로 실행할 코드;
	 * }
	 * 
	 * - 초기식: 반복문이 시작될 때 "초기에 한번만 실행"되는 구문이다.
	 *         반복문에서 사용할 변수를 선언 및 초기화 하는 역할.
	 * - 조건식: "반복이 수행될 조건"을 작성하는 구문
	 *          조건식의 결과가 true 라면 반복 수행.
	 *          조건식의 결과가 false 라면 반복 종료.
	 * - 증감식: 반복문을 제어하는 변수 값을 증강시키는 구문 (++, --)
	 * 
	 * for 문 실행 흐름
	 * 1. 초기식 실행
	 * 2. 조건식 실행
	 * 3_1. 조건식의 결과가 참이라면 for 문 내브 코드 실행
	 * 3_2. 조건식의 결과가 거짓이라면 for 문 종료.
	 * 4. for 문 내부코드 실행 후, 증감식 실행.
	 * 5. 다시 조건식부터 실행. (2번으로 이동)
	 * 
	 */
	
	public void method1() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi, Omnis!");			
		}
		
		for (int i = 11; i < 16; i++) {
			System.out.println("Hi Hi, Omnis!");			
		}
		
		for (int i = 0; i < 10; i += 2) {
			System.out.println("Hi!!");
		}
	}
	
	public void method2() {
		// 1 2 3 4 5
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1) + " ");
		}
	}
	
	public void method3() {
		// 1 3 5 7 9
		// 1과 10 사이의 정수중 홀수만 출력하는 반복문을 만드시오.
		
		for (int i = 0; i < 5; i++) {
			System.out.print((i*2 + 1) + " ");
		}
	}
	
	public void method4() {
		// 산술연산과 반복문을 사용하여
		// 1부터 10까지의 합계
		
		int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 += i;
		}
		
		System.out.println("sum1: " + sum);
		System.out.println("sum2: " + sum2);
	}
	
	public void method5() {
		// 1에서부터 매번 달라지는 "랜덤값" 까지의 총 합계
		
		/*
		 *  java.lang.Math 클래스의 random()를 호출하면
		 *  매번 다른 실수형의 랜덤값을 얻어올 수 있다.
		 *  랜덤값의 범위: 0.0 <= 랜덤값 < 1.0
		 *  
		 *  만약 1과 10 사이의 랜덤값을 얻고 싶다면?
		 *  
		 *  우선 10을 곱하기
		 *  0.0 <= 랜덤값 < 10.0
		 *  1 더하기
		 *  1.0 <= 랜덤값 < 11.0
		 *  소수점 버리기 (정수)
		 *  1 <= 랜덤값 <= 10
		 *  
		 *  코드 --> 랜덤값 * 10 + 1
		 *  10 -> 출력하고자 하는 갯수
		 *  1 -> 시작수
		 *  
		 *  Math.random() * 출력할 갯수 (범위) + 시작수
		 *  --> 시작수 ~ (시작수 + 갯수)
		 *  
		 */
		
		int random = (int)(Math.random() * 10 + 1);
		System.out.println("1 ~ 10 사이의 랜덤값: " + random);
		
		int sum = 0;
		
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.println("1부터 랜덤값 까지의 합: " + sum);
	}
	
	public void method6() {
		String str = "Hello, Omnis!";
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method7() {
		// 중첩반복문.
		
		// 구구단 출력
		// 구구단 2단 출력
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 2 * 9 = 18
		
		for (int j = 2; j < 10; j++) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d ", j, i, j * i);
				System.out.println();
			}	
		}
		
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("2 * %d = %d ", i, i * 2);
//			System.out.println();
//		}
	}
	
	public void method8() {
		//*****
		// 4번
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	public void method9() {
		// 1***
		// *2**
		// **3*
		// ***4
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i == j) {
					System.out.print(i);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
}





































