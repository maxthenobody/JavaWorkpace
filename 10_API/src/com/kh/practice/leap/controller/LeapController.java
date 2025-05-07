package com.kh.practice.leap.controller;

import java.util.Calendar;
//import java.util.Date;
import java.util.GregorianCalendar;

public class LeapController {
	public boolean isLeapYear(int year) {
//		연도가 윤년이면 true, 평년이면
//		false 리턴
//		(윤년: 연도가 4의 배수이면서,
//		100의 배수가 아니거나 400의 배
//		수가 되는 해)
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}
		else {
			return false;
		}
		
//		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0); // 이렇게 해도 됨.
//		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0; // 이게 맞음. 설명이 틀림.
	}
	
	public long leapDate(Calendar c) {
//		1년 1월 1일부터 오늘까지의 총
//		날 수를 계산
//		1년부터 현재 연도까지 각 연도가
//		윤년이면 총 날수에 366일을, 평
//		년이면 365일을 더함
//		해당 현재 연도가 윤년이면 2월을
//		29일로 평년이면 28일로 더함
//		월의 날짜 수를 더함
//		(31일: 1, 3, 5, 7, 8, 10, 12월/
//		30일: 4, 6, 9, 11월)
		
		Calendar first = new GregorianCalendar(1, 0, 1, 0, 0, 0);
		
		long diff = c.get(Calendar.YEAR) - first.get(Calendar.YEAR);
		
		long sum = 0;
		
		for (int i = 0; i < diff; i++) {
			if (isLeapYear(i)) {
				sum += 366;
			}
			else {
				sum += 365;
			}
		}
		
		return sum;
	}
}





















