package com.kh.practice.book.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	private Book[] bArr = new Book[10];
	
	public void fileSave(Book[] bArr) {
//		book.txt 파일에 객체 저장
		// 객체를 저장하는 스트림인 ObjectOutputStream을 가지고 book.txt에
		// 매개변수로 받은 bArr을 저장, 단 null이 아닌 것만 저장함
		
		try (ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("book.txt")))){
			
			for (Book b : bArr) {
				if (b != null) {
					os.writeObject(b);					
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Book[] fileRead() {
//		book.txt 파일에 있는 데이터를
//		Book 객체 배열에 담아 반환
		
		// 저장된 객체를 읽어오는 스트림인 ObjectInputStream을 가지고
		// book.txt에 저장된 객체를 필드 bArr에 저장하여 반환
		// 더 이상 파일에 읽을 게 없을 때 뜨는 예외인 EOFException이 발생하면
		// 예외만 잡아주고 안에는 아무 처리도 하지 않음
		
		try (ObjectInputStream os = new ObjectInputStream(new BufferedInputStream(new FileInputStream("book.txt")))){
			
			int count = 0;
			while (true) {
				bArr[count] = (Book) os.readObject();
				count++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bArr;		
	}
}




















