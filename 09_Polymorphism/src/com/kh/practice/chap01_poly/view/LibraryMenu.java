package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// 메인 메뉴 출력 메소드
		
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		// LibraryController의 insertMember() 메소드에 전달
//		==== 메뉴 ==== // 무한 반복 실행
//		1. 마이페이지 // LibraryController의 myInfo() 호출하여 출력
//		2. 도서 전체 조회 // LibraryMenu의 selectAll() 호출
//		3. 도서 검색 // LibraryMenu의 searchBook() 호출
//		4. 도서 대여하기 // LibraryMenu의 rentBook() 호출
//		9. 프로그램 종료하기
//		메뉴 번호 :
		
		if (lc.myInfo() == null) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("나이: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("성별(M/F): ");
			char gender = sc.nextLine().toUpperCase().charAt(0);
			
			lc.insertMember(new Member(name, age, gender, 0));			
		}
		
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.print("메뉴 번호: ");
		
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		switch (menuNum) {
		case 1:
			System.out.println(lc.myInfo());
			break;
		case 2:
			selectAll();
			break;
		case 3:
			searchBook();
			break;
		case 4:
			rentBook();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			return;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			mainMenu();
		}
		
		System.out.println();
		mainMenu();
	}
	
	public void selectAll() {
		// 도서 전체 목록 출력 메소드
		
		// LibraryController의 selectAll()메소드 호출하여 결과 값 Book[] 자료형 bList에 담기
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
//		ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		
		Book[] bList = lc.selectAll();
		
		for (int i = 0; i < bList.length; i++) {
			if (bList[i] instanceof AniBook) {
				System.out.println(i + "번도서: AniBook / " + bList[i]);				
			}
			else if (bList[i] instanceof CookBook) {
				System.out.println(i + "번도서: CookBook / " + bList[i]);
			}
		}
	}
	
	public void searchBook() {
//		검색할 제목 키워드를 입력 받아 검
//		색 결과를 출력하는 메소드
		
		// “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
		// LibraryController의 searchBook() 에 전달
		// 그 결과 값을 Book[] 자료형 searchList에 담아 검색 결과인 도서 목록 출력
		
		System.out.print("검색할 제목 키워드: ");
		
		String keyword = sc.nextLine();
		
		Book[] searchList = lc.searchBook(keyword);
		
		for (int i = 0; i < searchList.length; i++) {
			if (searchList[i] instanceof AniBook) {
				System.out.println("AniBook / " + searchList[i]);				
			}
			else if (searchList[i] instanceof CookBook) {
				System.out.println("CookBook / " + searchList[i]);
			}
		}
	}
	
	public void rentBook() {
//		대여할 도서 인덱스를 입력 받아
//		LibraryController의 rentBook 메소드
//		로 전달
//		→ 결과 값을 result로 받아 result가
//		0일 경우, 1일 경우, 2일 경우 각각에
//		해당하는 출력문 출력
		
		// 도서대여를 위해 도서번호를 알아야 하기 때문에 selectAll() 메소드 호출
		// “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
		// LibraryController의 rentBook() 에 전달
		// 그 결과 값을 result로 받고 그 result가
		// 0일 경우 → “성공적으로 대여되었습니다.” 출력
		// 1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
		// 2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니
//		마이페이지에서 확인하세요” 출력
		
		selectAll();
		
		System.out.print("대여할 도서 번호 선택: ");
		
		int index = sc.nextInt();
		
		if (index < 0 || index > 4) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			rentBook();
		}
		
		int result = lc.rentBook(index);
		
		switch (result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
			break;
		}
	}
}
























