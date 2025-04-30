package com.kh.practice3.model.vo;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}

	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	@Override
	public String toString() {
//		“저의 이름은” + name + “이고, 종류
//		는 “ + kinds + “입니다.“의 형식으로
//		문자열 만들어 리턴 처리
		
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	public abstract void speak();
}
