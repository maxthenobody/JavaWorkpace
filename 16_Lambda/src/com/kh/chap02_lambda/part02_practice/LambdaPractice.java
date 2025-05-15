package com.kh.chap02_lambda.part02_practice;

import com.kh.chap02_lambda.model.functional.LambdaTest1;
import com.kh.chap02_lambda.model.functional.LambdaTest2;

public class LambdaPractice {
	public static void main(String[] args) {
		// 람다식 문법 종류
		// 1. 기본형태
		LambdaTest1 lambda1 = (int x, int y) -> {return x + y;};
		
		// 2. 매개변수의 자료형 생략 가능
		LambdaTest1 lambda2 = (x, y) -> {return x + y;};
		
		// 3. 매개변수의 () 생략 가능. 단, 매개변수가 딱 1개 있을 경우
		LambdaTest2 lambda3 = str -> {System.out.println(str);};
		
		// 4. 중괄호 생략 가능. 단, 실행할 코드가 한 줄인 경우.
		LambdaTest1 lambda4 = (x, y) -> x + y;
		LambdaTest2 lambda5 = str -> System.out.println(str);
		
		// - 실습문제 -
        // 각 람다식을 가장 간결한 형태로 표현하기
        // 1. ((int x) -> { return (x * x); });
//		      x -> x*x;
        // 2. (String str) -> { return (str.length()); };
//		      str -> str.length();
        // 3.  (int x) -> { System.out.println(x); return x; };
//		      x -> {System.out.println(x); return x;};
        // 4. (String str) -> { return (str.toUpperCase()); };
//		      str -> str.toUpperCase();
        // 5. (int x , int y) -> { return (x * y); };
//		      (x, y) -> x * y;
        // 6. ((int x , int y) -> { return (x % y == 0); });
//		      (x, y) -> x % y == 0;
        // 7. (int x , String str1) -> { return (str1 + x); };
//		      (x, str1) -> str1 + x;
        // 8. ((int x , String str1) -> { System.out.println(x + str1); });
//		      (x, str1) -> System.out.println(x + str1);
        // 9. (int[] arr) -> { return (Math.max(Math.max(arr[0], arr[1]), arr[2])); };
//		      arr -> Math.max(Math.max(arr[0], arr[1]), arr[2]);
        // 10. ((String str1, String str2) -> { String result =  (str1.concat(str2)); return result; });
//		      (str1, str2) -> str1.concat(str2);
	}
}



























