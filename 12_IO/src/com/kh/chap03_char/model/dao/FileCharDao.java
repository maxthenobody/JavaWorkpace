package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	public void fileSave() {
		// FileWriter
		// try - with Resource 문
		// 스트림 자원 객체 생성시 사용
		// 객체사용 종료시 자원 자동 반납
		try (FileWriter fw = new FileWriter("b_char.txt")) {
			
			fw.write("Hi, Omnis!");
			fw.write('a');
			fw.write('한');
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		// FileReader
		
		try (FileReader fr = new FileReader("b_char.txt")) {
			
			int value = 0;
			
			while (value >= 0) {
				value = fr.read();
				
				System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}





















