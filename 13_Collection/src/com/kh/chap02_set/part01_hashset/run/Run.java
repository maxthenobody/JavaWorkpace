package com.kh.chap02_set.part01_hashset.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chap02_set.part01_hashset.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		/*
		 * Set
		 *  - 중복을 허용하지 않는 자료구조.
		 *  - 저장된 순서를 보장하지 않는다.
		 * HashSet: 중복을 허용하지 않고, 빠르게 저장이 가능한 자료구조. 
		 * LinkedHashSet: 중복을 허용하지 않지만, 저장된 순서는 유지.
		 * TreeSet: 중복을 허용하지 않지만, 오름차순 정렬을 지원한다.
		 * 
		 */
		HashSet<String> hs1 = new HashSet<>();
		
		// add: 값 추가
		hs1.add("반갑습니다");
		hs1.add("반갑습니다");
		hs1.add("여러분");
		hs1.add("여러분");
		hs1.add("안녕하세요");
		
		System.out.println(hs1); // 중복값 x, 저장순서 x
		System.out.println(hs1.size());
		
		hs1.remove("여러분");
		System.out.println(hs1);
		
		System.out.println("------------------------------------------------");
		
		// 반복처리
		for (String s: hs1) {
			System.out.println(s);
		}
		
		// set 계열을 list 계열로 옮겨 담는 방법들
		ArrayList<String> list = new ArrayList<>(hs1); // 컬렉션의 데이터를 배열에 모두 담은상태로 컬렉션 생성
		list.addAll(list); // 비어있는 상태로 만든다음에 addAll 메서드 써도 됨.
		System.out.println(list);
		
		// Iterator 사용
		Iterator<String> iter = hs1.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("====================================================");
		
		HashSet<Student> hs2 = new HashSet<>();
		
		hs2.add(new Student("공유", 40, 100));
		hs2.add(new Student("홍길동", 20, 10));
		hs2.add(new Student("김유신", 20, 30));
		hs2.add(new Student("공유", 40, 100));
		
		System.out.println(hs2);
		
		/*
		 * HashSet 에 객체를 저장할 때는
		 *  1. 객체의 hashCode() 함수로 저장할 위치를 찾아가고
		 *  2. 저장한 위치에 이미 저장된 값이 있다면, equals() 메서드를 통해 저장된 값과 새로 추가할 값이 같은지 검사한다.
		 *  3. 두 값이 같다면 데이터를 중복으로 저장하지 않고, 두 값이 다르다면 저장된 값의 다음 위치에 새로운 값을 저장한다.
		 * 
		 */
		
		// LinkedHashSet: 저장순서 유지
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(34);
		set1.add(12);
		set1.add(123);
		set1.add(555);
		
		System.out.println(set1);
		
		// TreeSet -> 정렬
		// Set 내부에 대에터가 추가될 때 compare, compareTo 메서드를 자동 실행.
		Set<Integer> set2 = new TreeSet<>(set1);
		// ArrayList, Set 을 매개변수로 추가시 안에 담긴 데이터의 기본정렬방식대로 정렬
		// Comparator 객체를 추가하면, 이후 Set 에 데이터를 추가할 때 Comparator 에 정의한 정렬조건대로 정렬이 이루어 진다.
		System.out.println(set2);
	}
}


























