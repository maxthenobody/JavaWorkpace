package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
//		PhoneController객체를 생
//		성하여 method() 호출하여
		
		// PhoneController객체 생성하고 method() 호출 후 반환 값을 String 배열에 담고
		// 반복문을 이용하여 String배열의 각 인덱스 출력
		
		PhoneController pc = new PhoneController();
//		pc.method();
		
		for (int i = 0; i < pc.method().length; i++) {
			System.out.println(pc.method()[i]);
			System.out.println();
		}
	}
}
