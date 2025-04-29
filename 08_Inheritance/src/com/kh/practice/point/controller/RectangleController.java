package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
//		받은 매개변수를 이용하여 필드들을 초기
//		화하고 초기화한 정보와 면적 반환
		// 면적 : 너비 * 높이
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return "면적: " + r.toString() + " / " + (width * height);		
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
//		받은 매개변수를 이용하여 필드들을 초기
//		화하고 초기화한 정보와 둘레 반환
		// 둘레 : 2 * (너비 + 높이)
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return "둘레: " + r.toString() + " / " + (2 * (width + height));		
	}
}
