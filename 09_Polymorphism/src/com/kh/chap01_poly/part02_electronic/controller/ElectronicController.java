package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicController {
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	// 다형성 적용후 사용할 부모객체배열
	private Electronic[] elecArr = new Electronic[3];
	
	// 다형성 적용 전
	// 제품 입고 메서드
	public void insert(Desktop d) {
		desk = d;
	}
	
	public void insert(NoteBook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	// 제품 조회 메서드
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
	// 다형성 추가후 메서드
	public void insert(Electronic e, int idx) {
		elecArr[idx] = e;
	}
	
	public Electronic select(int idx) {
		return elecArr[idx];
	}
}

























