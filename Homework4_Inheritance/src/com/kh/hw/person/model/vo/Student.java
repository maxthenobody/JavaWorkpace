package com.kh.hw.person.model.vo;

public class Student extends Person {
	private int grade; // 학년
	private String major; // 전공
	
	public Student() {
		
	}

	public Student(String name, int age, int grade, String major) {
		super(name, age);
		this.grade = grade;
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + grade + ", " + major;
	}	
}
