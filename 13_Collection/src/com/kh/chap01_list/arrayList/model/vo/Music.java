package com.kh.chap01_list.arrayList.model.vo;

import java.util.Objects;

public class Music implements Comparable<Music> {
	private String title;
	private String artist;
	
	public Music() {
		
	}

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
	
	/*
	 * equals 메서드 재정의
	 *  - 각 객체간의 필드값이 동일하다면 같은 객체가 될수 있도록 오버라이딩
	 * 
	 */
	
	@Override
	public boolean equals(Object o) {
		
		if (!(o instanceof Music)) {
			return false;
		}
		
		Music other = (Music) o;			
		
		if (this.title.equals(other.title) && this.artist.equals(other.artist)) {
			return true;
		}
		
		return false;
	}
	
	/*
	 * hashCode()
	 *  - 오버라이딩하기 전에는 객체가 저장된 주소값을 10진수 형태로 반환해주는 함수
	 *  - 단, equals 메서드를 오버라이딩 한다면, hashCode() 메서드도 함께 오버라이딩 해줘야 한다.
	 *  - hashCode 는 HashMap, HashSet 에서 데이터를 저장하기 위한 key 값에 사용되는 메서드.
	 *  - hashCode 는 오버라이딩하지 않고, equals 메서드만 오버라이딩 하면 논리적으로 두 객체는 같지만,
	 *    데이터가 저장될때는 다른 주소값을 가지므로 중복으로 데이터가 저장된다.
	 * 
	 */
	@Override
	public int hashCode() {
		return Objects.hash(title, artist);
	}

	@Override
	public int compareTo(Music o) {
		/*
		 * 현재 객체와 매개변수로 전잘된 객체간의 비교 수행
		 * 양수, 0, 음수인 경우가 반환되도록 설정
		 * 양수 -> 자리 유지
		 * 0 -> 자리 유지
		 * 음수 -> 자리 교체
		 * 
		 */
		
		// 제목기준 오름차순 정렬.
		// 현재객체 비교 다른객체 ==> 오름차순정렬
		// 다른객체 비교 현재객체 ==> 내림차순정렬
//		return this.title.compareTo(o.title); // 오름차순
		return o.title.compareTo(this.title); // 내림차순 (앞에 - 붙여도 됨)
	}
	
}





















