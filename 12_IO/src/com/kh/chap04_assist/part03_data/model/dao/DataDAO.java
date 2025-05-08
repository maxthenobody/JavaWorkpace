package com.kh.chap04_assist.part03_data.model.dao;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DataDAO {
	
	// DataXXX -> 기본자료형 단위로 입출력을 지원하는 보조스트림
	
	// 기반스트림 (FileOutputStream)
	// 보조스트림1 (DataOutputStream)
	// 보조스트림2 (OutputStreamWriter): 스트림을 라이터로
	// 보조스트림3 (BufferedWriter)
	public void fileSave() {
//		try (DataOutputStream ds = new DataOutputStream(
		
//		new OutputStreamWriter(new FileOutputStream(new File("sample.txt"))))
//
//		
//		) {
		
		try (BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
						new DataOutputStream(
								new FileOutputStream(
										new File("sample.txt")))));
				
			DataOutputStream ds = new DataOutputStream(new FileOutputStream("sample2.txt"))
			) {
			
			ds.writeBoolean(true);
			ds.writeInt(300);
			ds.writeDouble(3.14);
			ds.writeChar('한');
			ds.writeUTF("문자열 작성"); // 문자열 저장 지원
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		
		// 저장된 자료형의 순서에 맞춰서 읽기
		try (DataInputStream ds = new DataInputStream(new FileInputStream("sample2.txt"))) {
			
			System.out.println(ds.readBoolean());
			System.out.println(ds.readInt());
			System.out.println(ds.readDouble());
			System.out.println(ds.readChar());
			System.out.println(ds.readUTF());
			
			ds.readBoolean();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}



















