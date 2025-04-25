package com.kh.chap03_field.model.vo;

public class Run {
	public static void main(String[] args) {
		FieldTest1 ft1 = new FieldTest1();
		ft1.test(0);
		
		FieldTest2 ft2 = new FieldTest2();
		
		// 같은 패키지에서는 default, protected, public 접근 가능
//		System.out.println(ft2.df);
//		System.out.println(ft2.pro);
//		System.out.println(ft2.pub);
		
		FieldTest3 ft3 = new FieldTest3();
		System.out.println(ft3.sta); // 객체 생성할 필요가 없음
		System.out.println(ft3.PI);
		
		// static 변수 사용 방법
		// 클래스명.변수명
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest3.PI);
		
		// 클래스명.메서드명();
		FieldTest3.test();
		
	}
}
