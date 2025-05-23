package com.kh.chap02_lambda.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LamdaPractice6 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jin", "Suga", "RM", "J-Hope", "V");
		Comparator<String> comp = getComparator("length");
		names.sort(comp);
		System.out.println(names); // 길이순 정렬
		comp = getComparator("reverse");
		names.sort(comp);
		System.out.println(names); // 알파벳 역순 정렬
	}
	
	public static Comparator<String> getComparator(String mode) {
		// 코드 구현
		Comparator<String> comp;
		
		comp = (x, y) -> {
			if (mode.equals("length")) {
				return x.length() - y.length();
			} else if (mode.equals("reverse")) {
				return -x.compareTo(y);
			} else {
				return x.compareTo(y);
			}
		};
		
		return comp;
		
//		switch (mode) { // 이렇게 해도 됨.
//		case "length":
//			return (x, y) -> x.length() - y.length();
//		case "reverse":
//			return (x, y) -> -x.compareTo(y);
//		default:
//			return (x, y) -> x.compareTo(y);
//		}
	}
}
