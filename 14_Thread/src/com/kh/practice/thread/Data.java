package com.kh.practice.thread;

public class Data {
	private int value;
	private boolean isEmpty = true;
	
	public Data() {
		
	}
	
	public void setValue(int value) {
//		value 값 기록 저장함
//		단, isEmpty 가 true
//		가 될때까지 대기,
//		true가 되면 기록
//		처리하고, isEmpty
//		값false로 바꾸고,
//		대기중인 스래드를
//		실행시킴
//		동기화 처리함
		
		synchronized(this) {			
			if (isEmpty == false) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			isEmpty = false;		
			this.value = value;
			System.out.println("값이 입력되었습니다.");
			System.out.println("put value: " + value);
			notifyAll();
		}
	}

	public int getValue() throws EmptyException {
//		value 값을 꺼냄
//		단, isEmpty 가 false
//		가 될때까지 기다림, false 가 되면
//		value를 꺼내고,
//		isEmpty를 true 로
//		바꾸고 대기상태의
//		스래드를 실행시킴
//		값이 비었는데 꺼내
//		려고 할 때
//		EmptyException 발
//		생시킴.
//		동기화 처리함
		
		synchronized(this) {			
			if (isEmpty == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			if (isEmpty) {
				throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오…");
			}
			
			isEmpty = true;
			
			System.out.println("get value: " + value);
			System.out.println("값을 꺼냈습니다. value 가 비었습니다.");
			
			notifyAll();
			return value;
		}
	}
}
