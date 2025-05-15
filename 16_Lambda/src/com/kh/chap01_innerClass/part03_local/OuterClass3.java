package com.kh.chap01_innerClass.part03_local;

public class OuterClass3 {
	private String str = "외부필드";
	private static String staticStr = "외부스태틱필드";
	
	public Runnable getRunnable(int num) {
		// 지역 내부 클래스
		/* - 지역변수처럼 메서드 내부에서 클래스를 정의하여 사용하는 것.
		 * - 메서드 안에서만 사용 가능하며, 메서드가 호출될 때 생성된다.
		 * - 지역 내부 클래스 안에서 사용되는 지역변수는 "상수"(final)처럼 취급된다.
		 *   (메모리 효율성)
		 * 
		 * 메모리복습
		 * 1) stack
		 * - 메서드가 호출되면 스택에는 메서드 프레임이 쌓인다.
		 * - 메서드 프레임 내부에는 지역변수를 위한 저장공간이 할당.
		 * - 메서드 종료시에는 메서드 프레임이 제거되면서 지역변수의 저장공간도 함께 소멸된다.
		 * 
		 * 2) static 키워드가 붙은 변수는 static 메모리 영역에 저장공간이 할당.
		 *    static final(상수) -> static 메모리 내부의 constant pool 에 저장공간이 할당.
		 *    final 키워드만 붙은 변수 -> static 메모리 내부의 constant pool 에 저장공간이 할당. (사용 안하면 gc 가 수거)
		 * 
		 */
		int local = 1;
		// 지역변수는 지역 내부 클래스에서 사용되는 경우, final 예약어가 붙은 것처럼 취급된다.
		// 이유는, stack 메모리에서 지역변수의 저장공간이 소멸된 후, 참조를 유지하기 위해.
		
		class LocalInnerClass implements Runnable {
			private int innerNum = 10;
			
			@Override
			public void run() {
				System.out.println(num);
				// local = 2; // 에러뜸.
				System.out.println(local); // 메서드 소멸시 지역변수의 저장공간도 함께 소멸.
				System.out.println(innerNum);
				System.out.println(str);
				System.out.println(staticStr);
			}
		}
		
		return new LocalInnerClass();
	}
}
