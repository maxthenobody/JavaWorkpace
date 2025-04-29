package com.kh.practice.student.model.vo;

public class Student {
	private String name;
	private String subject;
	private int score;
	
	public Student() {
		
	}

	public Student(String name, String subject, int score) {
		super();
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String inform() {
//		이름 : 김길동 / 과목 : 자바 / 점수 : 100
//		이름 : 박길동 / 과목 : 디비 / 점수 : 50
//		이름 : 이길동 / 과목 : 화면 / 점수 : 85
//		이름 : 정길동 / 과목 : 서버 / 점수 : 60
//		이름 : 홍길동 / 과목 : 자바 / 점수 : 20
		return "이름: " + name + " / 과목: " + subject + " / 점수: " + score;
	}
}
