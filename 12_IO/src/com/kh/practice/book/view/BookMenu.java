package com.kh.practice.book.view;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	public BookMenu() {
		// 파일이 없을 때 만들어주기 위해 BookController(bc)에 makeFile() 호출
		// 필드에 있는 bArr에 bc의 fileRead() 반환 값 대입
		bc.makeFile();
		bArr = bc.fileRead();
	}
	
	public void mainMenu() {
//		1. 도서 추가 저장 ➔ fileSave()
//		2. 저장 도서 출력 ➔ fileRead()
//		9. 프로그램 끝내기 ➔ “프로그램 종료” 출력 후 종료
//		메뉴 번호 :
		// 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		
		System.out.println("1. 도서 추가 저장");
		System.out.println("2. 저장 도서 출력");
		System.out.println("9. 프로그램 끝내기");
		System.out.print("메뉴 번호: ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		switch (menuNum) {
		case 1:
			fileSave();
			break;
		case 2:
			fileRead();
			break;
		case 9:
			System.out.println("프로그램 종료");
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		mainMenu();
	}
	
	public void fileSave() {
//		저장할 책 정보 받아옴
		
//		도서 명 :
//		저자 명 :
//		도서 가격 :
//		출판 날짜(yyyy-mm-dd) :
//		할인율 :
//		// 입력 받은 출판날짜를 split()를 통해 년, 월, 일로 나누고 Calendar에 담음
//		// 각 요소와 새로 만든 Calendar를 Book 객체에 담고
//		// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달
		
		System.out.print("도서 명: ");
		String title = sc.nextLine();
		
		System.out.print("저자 명: ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격: ");
		int price = sc.nextInt();
		
		sc.nextLine();
		System.out.print("출판 날짜(yyyy-mm-dd): ");
		String date = sc.nextLine();
		
		String[] dateArr = date.split("-");
		Calendar cal = new GregorianCalendar(
				Integer.parseInt(dateArr[0]), Integer.parseInt(dateArr[1])-1, Integer.parseInt(dateArr[2]),
				0, 0, 0
				);
		System.out.print("할인율: ");
		double discount = sc.nextDouble();
		sc.nextLine();
		
//		System.out.println(bArr);
		
//		for (int i = 0; i < bArr.length; i++) {
//			System.out.println(bArr[i]);
//		}
		
		int index = 0;
		for (Book b: bArr) {
			if (b == null) {
				break;
			}
			index++;
		}
		
		bArr[index] = new Book(title, author, price, cal, discount);
		// [1]
		// [1,2]
//		System.out.println(bArr.length);
		
		bc.fileSave(bArr);
	}
	
	public void fileRead() {
//		저장된 책 정보 출력
		
		// bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출력
		Book[] bArr = bc.fileRead();
		
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i] != null) {
				System.out.println(bArr[i]);
			}
		}
		
//		System.out.println(bc.fileRead());
	}
}





















