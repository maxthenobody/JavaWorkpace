package com.kh.practice3.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void inputPractice3() {
		
		Scanner sc = new Scanner(System.in);
		
		// 가로, 세로 입력
		System.out.println("가로를 입력하세요 : ");
		double width = sc.nextDouble();
		System.out.println("세로를 입력하세요 : ");		
		double depth = sc.nextDouble();
		
		// 가로, 세로, 면적, 둘레
		double area = width * depth;
		double circumference = (width + depth) * 2;
		
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + depth);
		System.out.printf("면적 : %.2f\n", area);
		System.out.printf("둘레 : %.2f\n", circumference);
	}

}
