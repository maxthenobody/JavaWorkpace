package com.kh.chap02_enum.run;

import java.util.Arrays;

import com.kh.chap02_enum.model._enum.CarColor;

public class Run {
	public static void main(String[] args) {
//		CarColor.BLACK.printTest();
//		System.out.println(Arrays.toString(CarColor.values()));
//		System.out.println(CarColor.valueOf("BLACK"));
//		System.out.println(CarColor.valueOf(2));
		
		System.out.println(CarColor.BLACK);
		System.out.println(CarColor.WHITE.getColor());
		System.out.println(CarColor.valueOf(2));
//		System.out.println(CarColor.valueOf(3)); // 에러 으앙
		CarColor.WHITE.printTest();
	}
}
