package com.kh.chap01_thread.run;

public class Practice {
	public static void main(String[] args) {
		Thread th1 = new Thread(() -> {
			System.out.println("[대문자쓰레드 시작]");
			for (int i = (int)'A'; i <= (int)'Z'; i++) {
				System.out.println("[대문자쓰레드: " + (char)i + "]");
			}
			System.out.println("[대문자쓰레드 종료]");
		});
		
		Thread th2 = new Thread(() -> {
			System.out.println("[소문자쓰레드 종료]");
			for (int i = (int)'a'; i <= (int)'z'; i++) {
				System.out.println(Thread.currentThread().getName() + (char)i + "]");					
			}
			System.out.println("[소문자쓰레드 종료]");
		});		
		th2.setName("[소문자쓰레드: ");
		
		th1.start();
		th2.start();
	}
}
