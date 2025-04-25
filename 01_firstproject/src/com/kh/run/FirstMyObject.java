package com.kh.run;
// 주석
// package + class 명 == 풀 클래스명

import java.util.Date; // 날짜를 표시해주는 클래스 (패키지)

public class FirstMyObject {
	
	// 자바는 실행하기 위해서 반드시 main 메서드가 필요하다.
	public static void main(String[] args) {
		System.out.println("Hello, Omnis.");
		
		// 외부 클래스를 이용하여 현재 날짜를 출력
		System.out.println(new Date());
	}
}

// ex_firstproject라는 프로젝트를 생성한 후
// com.ex.run 패키지에 Test클래스를 만들고, 자신의 이름을 console창에
// 출력해보세요.