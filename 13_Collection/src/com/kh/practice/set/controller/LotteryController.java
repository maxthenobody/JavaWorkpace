package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		// 전달 받은 l을 lottery에 추가 후, 추가 결과인 boolean 값 반환
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		return lottery.remove(l);
	}
	
	public HashSet winObject() {
		// 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
		// 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,
		// 인덱스를 이용해 win에 당첨자 저장
		// 이 때, 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이어야 함
		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움
		
		HashSet winCopy = new HashSet();
		
		int count = 0;
		
		ArrayList lottoList = new ArrayList(lottery);
		
		if (lottery.size() < 4) {
//			throw new Exception("추첨자 수가 4명 미만입니다.");
			System.out.println("추첨자 수가 4명 미만입니다.");
//			return null;
		}
		
		while (count < 4) {
			if (winCopy.add(lottoList.get((int) (Math.random() * lottoList.size())))){
				count++;
			}
		}
		
//		winCopy.addAll(win);
		
		win = winCopy;
		
		return win;
	}
	
	public TreeSet sortedWinObject() {
		// 이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는
		// 정렬기준을 가지고 정렬된 결과를 반환
		// 이 때, 미리 만들어진 win을 가지고 정렬하기 때문에
		// 당첨 대상 확인을 꼭 먼저 해야함
		
		Comparator comp = new SortedLottery();
		
		TreeSet ts = new TreeSet(comp);
		
		ts.addAll(win);
		
		return ts;
	}
	
	public boolean searchWinner(Lottery l) {
		// 전달 받은 l을 win에서 찾고 찾은 결과인 boolean 값 반환
		return win.contains(l);
	}
}




























