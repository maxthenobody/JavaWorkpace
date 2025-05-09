package com.kh.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	private BookDAO bd = new BookDAO();
	
	public void makeFile() {
//		book.txt가 없을 때 만들어줌
		
		// “book.txt”를 매개변수로 받는 File 객체를 생성하여 book.txt가 없다면 파일 생성
		
		File file = new File("book.txt");
		
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave(Book[] bArr) {
//		매개변수를 DAO에 fileSave()로
//		넘겨줌
		
		// 매개변수로 받은 bArr을 BookDAO(bd)의 fileSave()의 매개변수로 보냄
		
		bd.fileSave(bArr);
	}
	
	public Book[] fileRead() {
//		DAO에 fileRead()의 값 반환
		
		// bd에 fileRead()의 반환 값을 그대로 반환
		
		return bd.fileRead();
	}
}
