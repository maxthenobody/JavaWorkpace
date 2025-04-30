package com.kh.practice.chap02_abstractNInterface.controller;

//import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
//import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
//import com.kh.practice.chap02_abstractNInterface.model.vo.V40;
import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
//		Phone객체 배열의 각 인덱
//		스에 GalaxyNote9, V40 객
//		체 저장하고 각 객체의 정
//		보를 문자열 배열에 저장
//		하여 문자열 배열 주소를
//		반환하는 메소드
//		for문을 이용하여 Phone
//		객체배열에 모든 인덱스를
//		참조.
//		(instanceof 활용하기)
//		이때 참조한 객체의 타입
//		이
//		GalayNote9 경우
//		GalayNote9에 오버라이딩
//		된 printInform() 호출,
//		V40인 경우
//		V40에 오버라이딩된
//		printInform() 호출
		
		// 2개의 Phone 객체를 저장할 수 있는 객체배열 생성
		// 각각의 인덱스에 다형성을 적용하여 GalaxyNote9, V40 객체 저장
		// for문을 이용하여 Phone 객체배열에 각 인덱스의 printInformation()의
		// 반환 값을 String배열에 담아 반환
		
		Phone[] pArr = new Phone[2];
		
		pArr[0] = new GalaxyNote9();
		pArr[1] = new V40();
		
		for (int i = 0; i < pArr.length; i++) {
			if (pArr[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)pArr[i]).printInformation();
			}
			else if (pArr[i] instanceof V40) {
				result[i] = ((V40)pArr[i]).printInformation();
			}
		}
		
		return result;
	}
}












