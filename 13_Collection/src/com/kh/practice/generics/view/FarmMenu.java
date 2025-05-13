package com.kh.practice.generics.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;
//import com.kh.practice.generics.model.vo.Fruit;
//import com.kh.practice.generics.model.vo.Nut;
//import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	private int count = 0;
	
	public void mainMenu() {
//		******* 메인 메뉴 *******
//		1. 직원메뉴 // adminMenu() 실행
//		2. 손님 메뉴 // customerMenu()
//		9. 종료 // “프로그램 종료.” 출력 후 main()으로 리턴
//		메뉴 번호 선택 : >> 입력 받음 // 메뉴 화면 반복 실행 처리
//		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
		
		if (count == 0) {
			System.out.println("========== KH 마트 ==========");			
		}
		count++;
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 직원메뉴");
		System.out.println("2. 손님 메뉴");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택: ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		switch (menuNum) {
		case 1:
			adminMenu();
			break;
		case 2:
			customerMenu();
			break;
		case 9:
			System.out.println("프로그램 종료.");
			return;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
		mainMenu();
	}
	
	public void adminMenu() {
//		******* 직원 메뉴 *******
//		1. 새 농산물 추가 // addNewKind() 실행
//		2. 종류 삭제 // removeKind()
//		3. 수량 수정 // changeAmount()
//		4. 농산물 목록 // printFarm()
//		9. 메인으로 돌아가기 // mainMenu()로 리턴
//		메뉴 번호 선택 : >> 입력 받음 // 메뉴 화면 반복 실행 처리
//		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
		
		System.out.println("******* 직원 메뉴 *******");
		System.out.println("1. 새 농산물 추가");
		System.out.println("2. 종류 삭제");
		System.out.println("3. 수량 수정");
		System.out.println("4. 농산물 목록");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 선택: ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		switch (menuNum) {
		case 1:
			addNewKind();
			break;
		case 2:
			removeKind();
			break;
		case 3:
			changeAmount();
			break;
		case 4:
			printFarm();
			break;
		case 9:
			return;
//			mainMenu();
//			break;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
		adminMenu();
	}
	
	public void customerMenu() {
//		******* 고객 메뉴 *******
//		1. 농산물 사기 // buyFarm() 실행
//		2. 농산물 빼기 // removeFarm()
//		3. 구입한 농산물 보기 // printBuyFarm()
//		9. 메인으로 돌아가기 // mainMenu()로 리턴
//		메뉴 번호 선택 : >> 입력 받음 // 메뉴 화면 반복 실행 처리
//		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
		
		System.out.println("== 현재 KH마트 농산물 수량 ==");
		printFarm();
		
		System.out.println("******* 고객 메뉴 *******");
		System.out.println("1. 농산물 사기");
		System.out.println("2. 농산물 빼기");
		System.out.println("3. 구입한 농산물 보기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 선택: ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		switch (menuNum) {
		case 1:
			buyFarm();
			break;
		case 2:
			removeFarm();
			break;
		case 3:
			printBuyFarm();
			break;
		case 9:
			return;
//			mainMenu();
//			break;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
		customerMenu();
	}
	
	public void addNewKind() {
//		‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 추가 농산물의 이름, 수량도
//		받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
//		출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름.
//		객체 안에 종류와 이름을 저장. 데이터를 저장한 객체와 수량을 fc(FarmController)의
//		addNewKind()로 넘기고 전달 받은 반환 값이 true면 “새 농산물이 추가되었습니다.”,
//		false면 “새 농산물 추가에 실패하였습니다. 다시 입력해주세요.” 출력
		
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("추가할 종류 번호: ");
		int kindNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("수량: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Farm f = null;
		
		switch (kindNum) {
		case 1:
			f = new Fruit("과일", name);
			break;
		case 2:
			f = new Vegetable("채소", name);
			break;
		case 3:
			f = new Nut("견과", name);
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			addNewKind();
		}
		
		if (fc.addNewKind(f, num)) {
			System.out.println("새 농산물이 추가되었습니다.");
		} else {
			System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			addNewKind();
		}
	}
	
	public void removeKind() {
//		‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 삭제할 농산물의 이름도
//		받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
//		출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름.
//		객체 안에 종류와 이름을 저장. 데이터를 저장한 객체를 fc의 removeKind()로 넘기고
//		전달받은 반환 값이 true면 “농산물 삭제에 성공하였습니다.”,
//		false면 “새 농산물 추가에 실패하였습니다. 다시 입력해주세요.” 출력
		
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		int kindNum = sc.nextInt();
		sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		Farm f = null;
		
		switch (kindNum) {
		case 1:
			f = new Fruit("과일", name);
			break;
		case 2:
			f = new Vegetable("채소", name);
			break;
		case 3:
			f = new Nut("견과", name);
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			removeKind();
		}
		
		if (fc.removeKind(f)) {
			System.out.println("농산물 삭제에 성공하였습니다.");
		} else {
			System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
//			removeKind();
		}
		
	}
	
	public void changeAmount() {
//		‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 수정 농산물의 이름,
//		수정할 수량도 받음. 없는 번호 선택 시 “잘못 입력하셨습니다. 다시 입력해주세요.”
//		출력 후 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름.
//		객체 안에 종류와 이름을 저장. 데이터를 저장한 객체와 수량을 fc의
//		changeAmount()로 넘기고 전달 받은 반환 값이 true면
//		“농산물 수량이 수정되었습니다.”,
//		false면 “농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.” 출력
		
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		int kindNum = sc.nextInt();
		sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("수량: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Farm f = null;
		switch (kindNum) {
		case 1:
			f = new Fruit("과일", name);
			break;
		case 2:
			f = new Vegetable("채소", name);
			break;
		case 3:
			f = new Nut("견과", name);
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			changeAmount();
		}
		
		if (fc.changeAmount(f, num)) {
			System.out.println("농산물 수량이 수정되었습니다.");
		} else {
			System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
		}
	}
	
	public void printFarm() {
//		fc의 printFarm()의 반환 값을 이용하여 keySet()을 통해
//		“종류 : 이름(n개)” 형식으로 출력
		
		HashMap<Farm, Integer> map = fc.printFarm();
		
		Set<Farm> keyset = map.keySet();
		
		for (Farm f : keyset) {			
			System.out.println(f.getKind() + ": " + f.getName() + "(" + map.get(f) + "개)");
		}
	}
	
	public void buyFarm() {
//		‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 구매할 농산물의 이름도
//		받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
//		출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름.
//		객체 안에 종류와 이름을 저장. 데이터를 저장한 객체를 fc의 buyFarm()로 넘기고
//		전달받은 반환 값이 true면 “구매에 성공하였습니다.”,
//		false면 “마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.” 출력
		
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		int kindNum = sc.nextInt();
		sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		Farm f = null;
		switch (kindNum) {
		case 1:
			f = new Fruit("과일", name);
			break;
		case 2:
			f = new Vegetable("채소", name);
			break;
		case 3:
			f = new Nut("견과", name);
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			buyFarm();
		}
		
		if (fc.buyFarm(f)) {
			System.out.println("구매에 성공하였습니다.");
		} else {
			System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
		}		
	}
	
	public void removeFarm() {
//		‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 구매취소할 농산물의 이름도
//		받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
//		출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름.
//		객체 안에 종류와 이름을 저장. 데이터 저장한 객체를 fc의 removeFarm()로 넘기고
//		전달받은 반환 값이 true면 “구매 취소에 성공하였습니다.”,
//		false면 “구매매 목록에 존재하지 않습니다. 다시 입력해주세요.” 출력
		
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		int kindNum = sc.nextInt();
		sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		Farm f = null;
		switch (kindNum) {
		case 1:
			f = new Fruit("과일", name);
			break;
		case 2:
			f = new Vegetable("채소", name);
			break;
		case 3:
			f = new Nut("견과", name);
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			removeFarm();
		}
		
		if (fc.removeFarm(f)) {
			System.out.println("구매 취소에 성공하였습니다.");
		} else {
			System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
		}
	}
	
	public void printBuyFarm() {
//		fc의 printBuyFarm()의 반환 값을 이용하여 Iterator를 통해 출력
		
		ArrayList<Farm> list = fc.printBuyFarm();
		
		Iterator<Farm> iter = list.iterator();
		
		while (iter.hasNext()) {
			Farm f = iter.next();
			switch (f.getKind()) {
			case "과일":
				System.out.println("과일: " + ((Fruit)f).getName());
				break;
			case "채소":
				System.out.println("채소: " + ((Vegetable)f).getName());
				break;
			case "견과":
				System.out.println("견과: " + ((Nut)f).getName());
				break;
			}
		}
	}
}






























