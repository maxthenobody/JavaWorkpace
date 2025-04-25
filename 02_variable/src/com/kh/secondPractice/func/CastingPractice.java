package com.kh.secondPractice.func;

import java.util.Scanner;

public class CastingPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void CastingPractice1() {
		
		// 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
		
		System.out.println("문자 하나를 입력하세요 : ");
		char myChar = sc.nextLine().charAt(0);
		
		System.out.println("문자 : " + myChar);
		System.out.println("유니코드 : " + (int)myChar);
		
	}
	
	// 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
	// 이 때 총점과 평균은 정수형으로 처리하세요.
	
	public void CastingPractice2() {
		
		int korean, english, math;
		System.out.println("국어 점수를 입력하세요 : ");
		korean = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		english = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
		
		int sum = korean + english + math;
		double average = (double)sum/3;
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", average);
	}
	
//	선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여
//	주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.
	
	public void CastingPractice3() {
		
		int iNum1 = 10, iNum2 = 4;
//		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2);
		System.out.println((int)dNum);
		
		System.out.println(iNum2 * dNum);
		System.out.println((double)iNum1);
		
		System.out.println((double)iNum1 / (double)iNum2);
		System.out.println(dNum);
		
		System.out.println((int)fNum);
		System.out.println((int)(iNum1 / fNum));
		
		System.out.printf("%.7f\n", (double)iNum1 / fNum);
		System.out.println((double)iNum1 / fNum);
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)ch + iNum1);
		System.out.println((char)((int)ch + iNum1));
		
		
	}


}




















