package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
//		DAO에 매개변수를 전달하고, DAO로부터
//		전달받은 값을 다시 반환
		
		// FileDAO(fd)의 checkName() 매개변수로 file을 넘겨주고
		// 그리고 그 반환 값을 그대로 받아 또 반환해줌
		
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) {
//		전달받은 매개변수를 변경하고 DAO에 전
//		달
		
		// 매개변수로 넘어온 sb를 String으로 바꿔 fd의 fileSave()메소드 매개변수로
		// file과 String을 넘김

//		System.out.println(""+ sb);
		
		fd.fileSave(file, "" + sb);
	}
	
	public StringBuilder fileOpen(String file) {
//		DAO에 매개변수를 전달하고, DAO로부터
//		전달받은 값을 다시 반환
		
		// fd의 fileOpen() 매개변수로 file을 넘겨주고 그 반환 값을 그대로 받아 또 반환
		
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
//		전달받은 매개변수를 변경하고 DAO에 전
//		달
		
		// 매개변수로 넘어온 sb를 String으로 바꿔 fd의 fileEdit()메소드 매개변수로
		// file과 String을 넘김
		
		fd.fileEdit(file, "" + sb);
	}
}















