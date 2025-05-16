package com.kh.chap02_lambda.practice;

public class LamdaPractice1 {
	public static void main(String[] args) {
		String[] arr = {"java", "lambda", "hi", "functional", "wow"};
		printStrings(arr, s -> s.length() >= 5);
	}
	
	public static void printStrings(String[] arr, StringChecker checker) {
		 for (String str : arr) {
			 if (checker.check(str)) {
				 System.out.println(str);
			 }
		 }
	}
	
//	interface StringChecker { // 이런식으로 해도 됨.
//		boolean check(String str);
//	}
}
