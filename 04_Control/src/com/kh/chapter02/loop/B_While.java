package com.kh.chapter02.loop;

public class B_While {
	/*
	 * while 문
	 * [표현법]
	 * 
	 * [초기식]
	 * while (조건식) {
	 *     // 반복적으로 실행할 코드.
	 *     [증감식] // 필수아님.
	 * }
	 * 
	 */
	
	public void method1() {
		// for 문을 while 문으로 변경
		
		int i = 0;
		while (i < 5) {
			System.out.println("Hi, Omnis!");
			i++;
		}
	}
	
	public void method2() {
		// while 문으로 5회 반복하여 아래 코드 출력.
		// 1 2 3 4 5
		
		int i = 0;
		while (i < 5) {
			System.out.print((i++ + 1) + " ");
//			i++;
		}
	}
	
	public void method3() {
		// 1부터 랜덤값(1~10) 까지의 총 합계를 while 문으로 작성
		// 출력예시: 1부터 random까지의 총합계: xxx
		
		int i = 1;
		int random = (int)(Math.random() * 10) + 1;
		int sum = 0;
		while (i <= random) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 %d까지의 총합계: %d", random, sum);
	}
	
	/*
	 *  do-while
	 *  [표현법]
	 *  do {
	 *     조건에 맞지 않더라도 무조건 한번은 실행될 수 있는 코드
	 *  } while (조건식);
	 *  do-while 문은 별도의 조건검사 없이 최초 한번은 무조건 실행된다.
	 * 
	 */
	
	public void method4() {
		do {
			System.out.println("Hi, Omnis!");
		} while (false);
	}
	
	public void method5() {
		// 1 2 3 4 5
		int i = 1;
		do {
			System.out.print(i++ + " ");
//			i++;
		} while (i <= 5);
	}
	
	
}

































