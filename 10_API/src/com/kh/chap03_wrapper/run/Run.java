package com.kh.chap03_wrapper.run;

public class Run {
	/*
	 * Wrapper 클래스
	 *  -> 기본 자료형을 객체로 포장해주는 클래스 
	 *  -> 기본 자료형을 객체로 만들어서, 필요한 메서드를 호출할 수 있다.
	 *  
	 * 기본자료형 <--------------------> Wrapper 클래스
	 * boolean                        Boolean
	 * char                           Character // 다름
	 * byte                           Byte
	 * short                          Short
	 * int                            Integer // 다름
	 * long                           Long
	 * float                          Float
	 * double                         Double
	 * 
	 */
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 == num2);		
//		System.out.println(num1.equals(num2));
		// 일반 자료형에는 메서드가 없으므로, 각 객체자료형의 메서드를 활용하고자 한다면 Wrapper 클래스로 변환해야한다.
		
		// 기본자료형 => Wrapper 로 변환(자동형변환)
		// Boxing
		Integer i1 = num1;
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode()); // Integer 는 값 그대로
		System.out.println(i1.compareTo(i2)); // i1 > i2 ? 왼쪽: 1, 오른쪽: -1, 같음: 0
		// a.compareTo(b): a 가 b 보다 크면 1, b 가 크면 -1, 같으면 0을 반환하는 함수.
		
		// Wrapper -> 기본자료형(자동형변환)
		// Unboxing
		int num3 = i1;
		int num4 = i2;
		
		System.out.println("==========================================================");
		
		// 기본자료형 <----------------> String
		// 문자열을 기본자료형으로 파싱하는 방법들
		
		String str1 = "10";
		String str2 = "15.3";
		
		// 변환하고자 하는 자료형의 Wrapper 클래스를 이용하여 parse
		
		int i = Integer.parseInt(str1); // 정수형태의 문자열이 아닌 경우 에러 발생.
		double d = Double.parseDouble(str2);
		
		System.out.println(i + d);
	}
	
}



























