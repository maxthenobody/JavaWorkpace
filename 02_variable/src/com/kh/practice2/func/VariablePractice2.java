package com.kh.practice2.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void inputPractice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		// 더하기
		int sum = num1 + num2;		
		System.out.println("더하기 결과 : " + sum);
		
		// 빼기
		int minus = num1 - num2;
		System.out.println("빼기 결과 : " + minus);
		
		// 곱하기
		int multiplication = num1 * num2;
		System.out.println("곱하기 결과 : " + multiplication);
		
		// 나누기
		double division = (double)num1 / (double)num2;
		System.out.printf("나누기 결과 : %.4f\n", division);
		
	}

}
