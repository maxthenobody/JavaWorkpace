package com.kh.practice.thread;

import java.util.Random;

public class Provider extends Thread {
	private Data data;

	public Provider(Data data) {
		super();
		this.data = data;
	}
	
	@Override
	public void run() {
//		Data의 value에 1부
//		터 100사이의 정수
//		를 기록하는 작업
//		10번 실행한다.
//		한번 기록하고 0.1
//		초 중지
		
		for (int i = 0; i < 10; i++) {
			data.setValue((new Random().nextInt(100)+1));
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
