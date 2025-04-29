package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
//		메인메뉴 출력, 잘못 입력했을 시 다시 받
//		도록 반복
		
//		===== 메뉴 =====
//		1. 원 ➔ circleMenu()
//		2. 사각형 ➔ rectangleMenu()
//		9. 끝내기
//		메뉴 번호 :
		
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호: ");
		int menuNum = sc.nextInt();
		
		switch (menuNum) {
		case 1:
			circleMenu();
			break;
		case 2:
			rectangleMenu();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			mainMenu();
		}		
	}
	
	public void circleMenu() {
//		원 메뉴 출력, 잘못 입력했을 시 메인메뉴
//		로 돌아감
		
//		===== 원 메뉴 =====
//		1. 원 둘레 ➔ calcCircum()
//		2. 원 넓이 ➔ calcCircleArea()
//		9. 메인으로
//		메뉴 번호 :
		
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호: ");
		int menuNum = sc.nextInt();
		
		switch (menuNum) {
		case 1:
			calcCircum();
			break;
		case 2:
			calcCircleArea();
			break;
		case 9:
			mainMenu();
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			circleMenu();
		}
	}
	
	public void rectangleMenu() {
//		사각형 메뉴 출력, 잘못 입력했을 시 메인
//		메뉴로 돌아감
		
//		===== 메뉴 =====
//		1. 사각형 둘레 ➔ calcPerimeter()
//		2. 사각형 넓이 ➔ calcRectArea()
//		3. 메인으로
//		메뉴 번호 : 
		
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("3. 메인으로");
		System.out.print("메뉴 번호: ");
		int menuNum = sc.nextInt();
		
		switch (menuNum) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 3:
			mainMenu();
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			rectangleMenu();
		}
	}
	
	public void calcCircum() {
//		X, y 좌표와 반지름을 받아 원의 정보와
//		원 둘레 출력
		
//		x 좌표 :
//		y 좌표 :
//		반지름 :
//		// 데이터를 CircleController(cc)의 calcCircum()의 매개변수로 보내 반환 값 출력
		
		System.out.print("x 좌표: ");
		int x = sc.nextInt();
		System.out.print("y 좌표: ");
		int y = sc.nextInt();
		System.out.print("반지름: ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcCircum(x, y, radius));
		
		circleMenu();
	}
	
	public void calcCircleArea() {
//		X, y 좌표와 반지름을 받아 원의 정보와
//		원 넓이 출력
		
//		x 좌표 :
//		y 좌표 :
//		반지름 :
//		// 데이터를 CircleController(cc)의 calcArea()의 매개변수로 보내 반환 값 출력
		
		System.out.print("x 좌표: ");
		int x = sc.nextInt();
		System.out.print("y 좌표: ");
		int y = sc.nextInt();
		System.out.print("반지름: ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcArea(x, y, radius));
		
		circleMenu();
	}
	
	public void calcPerimeter() {
//		X, y 좌표와 높이, 너비를 받아 사각형의
//		정보와 사각형 둘레 출력
		
//		x 좌표 :
//		y 좌표 :
//		높이 :
//		너비 :
//		// 데이터를 RectangleController(rc) calcPerimeter()의 매개변수로 보내 반환값 출력
		
		System.out.print("x 좌표: ");
		int x = sc.nextInt();
		System.out.print("y 좌표: ");
		int y = sc.nextInt();
		System.out.print("높이: ");
		int height = sc.nextInt();
		System.out.print("너비: ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(x, y, height, width));
		
		rectangleMenu();
	}
	
	public void calcRectArea() {
//		X, y 좌표와 높이, 너비를 받아 사각형의
//		정보와 사각형 넓이 출력
		
//		x 좌표 :
//		y 좌표 :
//		높이 :
//		너비 :
//		// 데이터를 RectangleController(rc) calcArea()의 매개변수로 보내 반환값 출력
		
		System.out.print("x 좌표: ");
		int x = sc.nextInt();
		System.out.print("y 좌표: ");
		int y = sc.nextInt();
		System.out.print("높이: ");
		int height = sc.nextInt();
		System.out.print("너비: ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, height, width));
		
		rectangleMenu();
	}
	
	
}














