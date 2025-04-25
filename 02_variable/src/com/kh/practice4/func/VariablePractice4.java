package com.kh.practice4.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void inputPractice4() {
		
		Scanner sc = new Scanner(System.in);
		
		// 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요
		
		// 입력
		System.out.println("영어 문자열을 입력하세요 : ");
		String myString = sc.nextLine();
		
		// 1
		System.out.println("첫 번째 문자 : " + myString.charAt(0));
		System.out.println("두 번째 문자 : " + myString.charAt(1));
		System.out.println("세 번째 문자 : " + myString.charAt(2));
		
	}

}
