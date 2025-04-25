package com.kh.variable;

public class D_Printf {
	
	public void printfTest() {
		
		/*
		 * println() -> 값 출력 후 자동 개행(\n)
		 * print() -> 값만 출력한 후 종료
		 * printf("출력할 형식", 형식에 맞는 값들 ...)
		 *  -> f는 format을 의미.
		 *  -> 형식에 맞춰서 값들을 출력한 후 종료 (줄바꿈 x)
		 *  문자열에 추가 가능한 형식
		 *  %d : decimal, 정수
		 *  %f : float, 실수
		 *  %c : char, 문자
		 *  %s : string, 문자열
		 */
		
		// 정수 테스트
		int iNum1 = 10;
		int iNum2 = 20;
		
		System.out.println("println iNum1 : " + iNum1 + ", iNum2 : " + iNum2);
//		System.out.println("iNum1 : " + iNum1);
//		System.out.println("iNum2 : " + iNum2);
		// printf 문 사용
		System.out.printf("printf iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
		
		// 실수 테스트
		double dNum = 4.01234567;
		System.out.printf("dNum : %f\n", dNum);
		// %f -> 소수점 아래 6번째 까지만 출력 (반올림)
		
		System.out.printf("dNum : %.1f\n", dNum);
		// 소수점 아래 첫번째 자리만 출력하고 싶다면?
	}

}
















