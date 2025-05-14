package com.kh.practice.thread;

public class MultiThreadTest {
	public static void main(String[] args) {		
		Data data = new Data();
		Thread putThread = new Provider(data);
		Thread getThread = new Customer(data);
		
		putThread.start();
		getThread.start();
		
//		System.out.println("메인스레드 작업 완료.");
	}
}
