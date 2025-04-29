package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
//		========== 학생 정보 출력 ==========
//		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
//		========== 학생 성적 출력 ==========
//		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력
//		========== 성적 결과 출력 ==========
//		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		
		System.out.println("========== 학생 정보 출력 ==========");
		
		Student[] arr = ssm.printStudent();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].inform());
		}
		
//		ssm.printStudent();
		System.out.println("========== 학생 성적 출력 ==========");
//		학생 점수 합계 : 315
//		학생 점수 평균 : 63.0
		
		double[] stats = ssm.avgScore();
		
		System.out.println("학생 점수 합계: " + (int)stats[0]);
		System.out.println("학생 점수 평균: " + stats[1]);
		
		System.out.println("========== 성적 결과 출력 ==========");
		
		
//		김길동학생은 통과입니다.
//		박길동학생은 재시험 대상입니다.
//		이길동학생은 통과입니다.
//		정길동학생은 통과입니다.
//		홍길동학생은 재시험 대상입니다.
		
		String result = "";
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getScore() < StudentController.CUT_LINE) {
				result = "재시험 대상";
			}
			else {
				result = "통과";
			}
			
			System.out.println(arr[i].getName() + "학생은 " + result + "입니다.");
		}
		
		for (Student std : arr) {
			System.out.println(std);
		}
		
	}
}





























