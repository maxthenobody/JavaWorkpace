package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
//	이름 나이 학년 전공
//	강건강 20 1 정보시스템공학과
//	남나눔 21 2 경영학과
//	류라라 23 4 정보통신공학과
	
//	이름 나이 급여 부서
//	박보배 26 100000000 영업부
//	송성실 38 200000000 기획부
	
//	s[0] = new Student()
	
	public int[] personCount() {
//		각 객체배열에 저장된 객체의 수를
//		정수배열에 담아 반환하는 메소드
		int[] count = new int[2];
		
		int sumStudent = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				sumStudent++;
			}
		}
		
		int sumEmployee = 0;
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				sumEmployee++;
			}
		}
		
		count[0] = sumStudent;
		count[1] = sumEmployee;
		
		return count;
	}
	
	public void insertStudent(String name, int age, int grade, String major) {
//		매개변수로 받아온 데이터를 학생 객
//		체 배열 중 빈 곳에 저장하는 메소드
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = new Student(name, age, grade, major);
				break;
			}
		}
	}
	
	public Student[] printStudent() {
//		학생 객체 배열의 주소를 반환하는
//		메소드
		
		return s;
	}
	
	public void insertEmployee(String name, int age, int salary, String dept) {
//		매개변수로 받아온 데이터를 사원 객
//		체 배열 중 빈 곳에 저장되는 메소드
		
		for (int i = 0; i < e.length; i++) {
			if (e[i] == null) {
				e[i] = new Employee(name, age, salary, dept);
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
//		사원 객체 배열의 주소를 반환하는
//		매소드
		
		return e;
	}
}
