package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	public LeapView() {
//		기본생성자로 이 안에 평년인지
//		윤년인지, 1년 1월 1일부터 지금
//		까지 며칠이 지났는지 모두 출력
		
		LeapController lp = new LeapController();
		
		Calendar cal1 = new GregorianCalendar();
		
//		lp.leapDate(cal1);
		
		if (lp.isLeapYear(cal1.get(Calendar.YEAR))) {
			System.out.println(cal1.get(Calendar.YEAR) + "년은 윤년입니다.");
		}
		else {
			System.out.println(cal1.get(Calendar.YEAR) + "년은 평년입니다.");
		}
		
		System.out.println("총 날짜 수: " + lp.leapDate(cal1));
	}
}
