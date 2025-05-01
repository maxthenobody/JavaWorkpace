package com.kh.practice.token.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
//		공백을 토큰으로 처리한
//		문자열 반환
		
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환
		
		StringTokenizer stn = new StringTokenizer(str, " ");
		
//		String result = "";
		
		StringBuilder sb = new StringBuilder();
		
		while (stn.hasMoreTokens()) {
//			result += stn.nextToken();
			sb.append(stn.nextToken());
		}
		
		return sb.toString();
	}
	
	public String firstCap(String input) {
//		첫 글자만 대문자로 바꾼
//		문자열 반환
		
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		
		char[] arr = input.toCharArray();
		
		arr[0] = ("" + arr[0]).toUpperCase().charAt(0);
		
		return String.valueOf(arr);
		
		// 다른 방식
//		String result = input.substring(0, 1).toUpperCase().concat(input.substring(1));
//		
//		return result;
		
	}
	
	public int findChar(String input, char one) {
//		문자열 안에 찾을 문자
//		개수가 몇 개 들어가있는
//		지 반환
		
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (one == input.charAt(i)) {
				count++;
			}
		}
		
		return count;
	}
}























