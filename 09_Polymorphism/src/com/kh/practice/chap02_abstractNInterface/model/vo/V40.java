package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen {
	private String name = "V40";
	
	public V40() {
//		기본 생성자
//		부모에게 상속받은 maker
//		필드를 “LG”로 초기화
		
		setMaker("LG");
	}
	
	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	@Override
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}
	
	@Override
	public String picture() {
		return "1200, 1600만 화소 트리플 카메라";
	}
	
	@Override
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	
	@Override
	public String touch() {
		return "정전식";
	}
	
	@Override
	public boolean bluetoothPen() {
		return false;
	}
	
	@Override
	public String printInformation() {
//		실행 화면을 참조하여
//		오버라이딩
		
		String information = name + "은 " + getMaker() + "에서 만들어졌고 제원은 다음과 같다.\n" + makeCall() + "\n" + takeCall() + "\n" + picture() + "\n" + charge() + "\n" + touch() + "\n블루투스 펜 탑재 여부: " + bluetoothPen();
		
		return information;
	}
}
