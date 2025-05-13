package com.kh.practice.thread;

public class Customer extends Thread {
	private Data data;
	
	public Customer(Data data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
//		Data가 가진 value
//		값을 10 번 꺼내어
//		출력한다.
//		한번 출력하고 0.1
//		초 중지
		
		for (int i = 0; i < 10; i++) {
			try {
//				System.out.println(data.getValue());
				data.getValue();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
