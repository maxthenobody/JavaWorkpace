package com.kh.chap03_field.model.vo;

public class FieldTest1 {
	/*
	 * 변수 구분
	 * - 전역변수(global): 클래스 영역 바로 아래에 선언하는 변수들
	 *                   클래스내 어디서든 사용 가능
	 * - 지역변수(local): 클래스 영역 내에서 특정영역 {} 에 선언한 변수.
	 *                  선언한 지역에서만 사용 가능
	 *                  
	 * 1. 전역변수
	 *  - 필드 == 인스턴스 변수 == 멤버변수
	 *    생성시점: 객체가 메모리에 할당되면 함께 생성.
	 *    소멸시점: 객체가 소멸할 때 함께 소멸.
	 *    
	 *  - 클래스변수 == static 변수 (static 변수는 static 메모리에 보관됨)
	 *    생성시점: 프로그램 시작과 동시에 static 영역에 메모리가 할당됨.
	 *    소멸시점: 프로그램 종료시
	 *    
	 * 2. 지역변수
	 *    생성시점: 특정영역{}이 실행될 때 할당.
	 *    소멸시점: 특정영역이 종료될 때 소멸.
	 * 
	 */
	
	private int global;
	
	public void test(int num) {
		int local = 0;
		
		if (true) {
			int a = 0;
		}
		
		// test 메서드를 사용하기 위해, FieldTest1 객체를 생성하게 되면 global 필드에는 항상 값이 초기화된다(JVM)
		System.out.println(global);
		System.out.println(local);
		System.out.println(num);
//		System.out.println(a);
	}
	
	
}










































