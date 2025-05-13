package com.kh.chap04_sync.part02_control.model.thread;

public class Data {
	private int item; // 생산/소비되는 아이템
	private boolean empty = true; // item의 상태를 저장하고, 흐름을 제어하기 위한 변수
	
	// 아이템 소비용 메서드
	public void getData() {
		synchronized(this) {
			// 만약 item 이 생산되기 전이라면, item 을 소비하지 않도록 "대기" 상태로 전환.
			if (empty) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			item = 0;
			empty = true;
			System.out.println("소비자가 " + item + "을 소비하였습니다.");
			// 소비 후 생산자에게 알려줘야함.
			notify(); // wait 상태의 다른 쓰레드를 깨우는 역할을 수행. (랜덤한거 하나)
		}
	}
	
	// 아이템 공급용 메서드
	public void setData() {
		synchronized(this) {
			// item이 비어있는 경우에만 item을 생성하기.
			// item이 비어있지 않다면, 사용자가 소비할 때까지 생산을 "대기"해줘야한다.
			if (empty == false) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			item = 1;
			empty = false;
			System.out.println("생산자가 " + item + "을 생산하였습니다.");
			// 생산자가 생산을 완료한 후, 생산이 완료되었음을 소비자에게 알려줘야 한다.
			notifyAll(); // waiting 상태의 모든 다른 쓰레드를 깨우는 메서드.
		}
	}
}


























