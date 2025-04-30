package com.kh.practice3.controller;

import com.kh.practice3.model.vo.*;

public class AnimalManager {
	public static void main(String[] args) {
//		사이즈 5짜리 Animal 타입의 객체 배
//		열 생성하여 각 인덱스별로 무작위로
//		Dog, Cat 클래스를 이용하여 객체 생
//		성하고 반복문으로 각 인덱스별 객체
//		의 speak() 메소드 실행
		
		Animal[] animalArr = new Animal[5];
		
		animalArr[0] = new Dog("콜라", "코카스패니얼", 15);
		animalArr[1] = new Dog("뮤츠", "푸들", 10);
		animalArr[2] = new Cat("야옹이", "몰라", "서울", "까망");
		animalArr[3] = new Cat("호랑이", "호랑이", "시베리아", "줄무늬");
		animalArr[4] = new Dog("누렁이", "골든리트리버", 20);
		
		for (int i = 0; i < animalArr.length; i++) {
			animalArr[i].speak();
		}
	}
}

















