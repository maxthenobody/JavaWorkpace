package com.kh.chap01_thread.run;

import com.kh.chap01_thread.thread.Thread1;
import com.kh.chap01_thread.thread.Thread2;

public class Run {
	public static void main(String[] args) {
		/*
		 * 프로그램
		 * - 어떤 작업(process)을 실행할 수 있는 파일.
		 * - CPU를 할당받지 않은 상태.
		 * 
		 * 프로세스
		 * - 현재 동작하고 있는 프로그램
		 * - 작업을 위해 cpu를 할당받은 상태
		 * 
		 * 스레드
		 * - 한 개의 프로세스 내에서 실제 작업을 수행하는 소단위
		 * - 모든 프로세스에는 반드시 1개 이상의 스레드가 존재한다.
		 * - 스레드는 메인스레드 1개와 n개의 일반스레드가 존재한다.
		 * 
		 * 싱글스레드
		 * - 메인스레드 1개 가지고 작업을 처리
		 * - 한 작업씩 차례대로 처리 한다.
		 * 
		 * 멀티스레드
		 * - 메인스레드 외 추가적인 스레드를 이용하여 동시에 여러 작업을 처리 한다.
		 * 
		 * 멀티스레드의 장점
		 * 1) 작업 효율성 증대
		 *    - A 쓰레드 B 쓰레드 나눠서 작업을 시킴으로써 더 빠르게 작업 완료가 가능하다.
		 * 2) 응답성 향상
		 *    - 사용자 입장에서 일처리가 빠르게 보인다.
		 * 3) cpu 를 효율적으로 사용 가능
		 *    - 싱글스레드 기준, 작업 완료시까지 cpu가 대기해야하는 상황이 생기는데, 멀티스레드 환경에서는
		 *      여러 작업이 동시에 수행되므로 cpu의 대기시간이 줄어든다.
		 *      
		 * 멀티스레드 프로그래밍시 주의점
		 * - 동기화 처리가 복잡해진다.
		 * - 스레드가 많을수록 stack 메모리를 많이 쓴다.
		 * - 시간이 더 오래 걸릴 수 있다.
		 * - 프로그램이 복잡해진다.
		 * 
		 */
		
		// 단일스레드
		// - 명령문을 순차적으로 실행
		for (int i = 1; i <= 100; i++) {
			System.out.println("작업 1 ["+i+"]");
		}
		for (int i = 1; i <= 100; i++) {
			System.out.println("작업 2 ["+i+"]");
		}
		
		// 스레드 생성방법들
		// 1. Thread 클래스를 상속.
		Thread th1 = new Thread1();
		
		System.out.println("================================");
		
		// 스레드 실행
		// th1.run();
		th1.start(); // 쓰레드 가동.
		// 쓰레드 생성 -> stack 메모리 할당 -> run() 메서드 실행.
		
		// 2. Runnable 인터페이스를 구현
		Thread th2 = new Thread(new Thread2());
		th2.start();
		
		// 3. 내부클래스를 통한 생성.
		class Thread3 extends Thread {
			@Override
			public void run() {
				System.out.println("Thread3 가동");
			}
		}
		Thread th3 = new Thread3();
		th3.start();
		
		// 4. 익명내부클래스
		Thread th4 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println("Thread4 ["+i+"]");					
				}
			}
		};
		
		// 5. Lambda 식을 활용한 쓰레드 생성
		Thread th5 = new Thread(() -> {
			for (int i = 1; i <= 100; i++) {	
				System.out.println("Thread5 ["+i+"]");					
			}
		});
		
		th4.start();
		th5.start();
		
		/*
		 * 스레드의 특징
		 * 
		 * 1. 동시성
		 *  - 멀티스레드 프로그래밍에서 여러개의 스레드가 동시에 실행되는 것처럼 보이는 현상으로,
		 *    실제로는 os의 "스케쥴러"에 의해 스레드의 전환이 순식간에 이루어져 동시에 실행되는 것처럼 보이는 현상. (싱글코어)
		 *  - 단, cpu 코어의 갯수가 많다면 실제로 여러개의 스레드가 동시에 실행된다.
		 *  
		 * 2. 병렬성
		 *  - 멀티스레드 프로그래밍에서 여러개의 스레드가 동시에 실행되는 것
		 *  - 코어의 갯수만큼 동시에 실행된다.
		 *  
		 * 3. 독립성
		 *  - 각 스레드는 독립적으로 실행되며, 다른 스레드의 영향을 받지 않는다.
		 *  - 개별적인 실행 흐름을 보장하기 위해 고유 stack 영역을 할당받는다.
		 *  - 메인스레드가 종료되더라도, 개별스레드가 실행중이라면 프로세스가 종료되지 않는다.
		 * 
		 */
		
	}
}
































