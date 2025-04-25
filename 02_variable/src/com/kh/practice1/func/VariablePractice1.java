package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public void inputPractice() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		// sc.nextLine();
		
		System.out.println("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
		
	}
	
}
