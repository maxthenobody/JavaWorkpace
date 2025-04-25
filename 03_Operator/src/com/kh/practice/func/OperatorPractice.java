package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
//		모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
//		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
//		ex.
//		인원 수 : 29
//		사탕 개수 : 100
//		1인당 사탕 개수 : 3
//		남는 사탕 개수 : 13
		
		System.out.println("인원 수를 입력하세요 : ");
		int numPeople = sc.nextInt();
		System.out.println("사탕 개수를 입력하세요 : ");
		int numCandy = sc.nextInt();
		
		System.out.println("인원 수 : " + numPeople);
		System.out.println("사탕 개수 : " + numCandy);
		System.out.println("1인당 사탕 개수 : " + (numCandy / numPeople));
		System.out.println("남는 사탕 개수 : " + (numCandy % numPeople));
		
	}
	
//	메소드 명 : public void practice2(){}
//	키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
//	이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
//	ex.
//	이름 : 민경민
//	학년(숫자만) : 3
//	반(숫자만) : 4
//	번호(숫자만) : 15
//	성별(M/F) : M
//	성적(소수점 아래 둘째자리까지) : 88.75
//	3학년 4반 15번 민경민 남학생의 성적은 88.75이다.
	
	public void practice2() {
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("학년을(숫자만) 입력하세요 : ");
		int grade = sc.nextInt();
		System.out.println("반을(숫자만) 입력하세요 : ");
		int classNum = sc.nextInt();
		System.out.println("번호를(숫자만) 입력하세요 : ");
		int personalNum = sc.nextInt();
//		System.out.println("성별을(남/여) 입력하세요 : ");
		System.out.println("성별을(M/F) 입력하세요 : ");
		sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		System.out.println("성적을 입력하세요 : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.", grade, classNum, personalNum, name, (gender == 'M' ? '남' : '여'), score);
		
	}
	
//	메소드 명 : public void practice3(){}
//	나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
//	성인(19세 초과)인지 출력하세요.
//	ex. 
//	나이 : 19
//	청소년
	
	public void practice3() {
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.println("나이 : " + age);
//		System.out.println("어린이(13세 이하) : " + (age <= 13));
		System.out.println((age <= 13) ? "어린이" : (age <= 19 ? "청소년" : "성인"));
//		System.out.println("청소년(13세 초과 ~ 19세 이하) : " + ((age > 13) && (age <= 19)));
//		System.out.println("어린이(19세 초과) : " + (age > 19));
		
	}
	
//	메소드 명 : public void practice4(){}
//	국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
//	세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//	세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//	세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//	ex.
//	국어 : 60
//	영어 : 80
//	수학 : 40
//	합계 : 180
//	평균 : 60.0
//	합격
	
	public void practice4() {
		
		System.out.println("국어 점수를 입력하세요 : ");
		int korean = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int english = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double avg = sum / 3;
		
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
//		System.out.println("합격 : " + ((korean >= 40) && (english >= 40) && (math >= 40) && (avg >= 60)));
		System.out.println(((korean >= 40) && (english >= 40) && (math >= 40) && (avg >= 60)) ? "합격" : "불합격");
		
	}
	
	public void practice5() {
		
//		주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
//		ex.
//		주민번호를 입력하세요(- 포함) : 132456-2123456
//		여자
		
		System.out.println("주민번호를 입력하세요(- 포함) : ");
		String idNum = sc.nextLine();
		char genderNum = idNum.charAt(7);
		
//		System.out.println("남자 : " + ((int)genderNum == 49));
//		System.out.println("여자 : " + ((int)genderNum == 50));
		// '1' 유니코드 == 49, '2' 유니코드 == 50
//		System.out.println(Integer.parseInt(String.valueOf('2'))); // '2' "2"
		
//		System.out.println("남자 : " + (Integer.parseInt(String.valueOf(genderNum)) == 1));
//		System.out.println("여자 : " + (Integer.parseInt(String.valueOf(genderNum)) == 2));
		
//		System.out.println((Integer.parseInt(String.valueOf(genderNum)) == 1) ? "남자" : ((Integer.parseInt(String.valueOf(genderNum)) == 2) ? "여자" : "주민번호가 올바르지 않습니다."));
		System.out.println((genderNum == '1') ? "남자" : ((genderNum == '2') ? "여자" : "주민번호가 올바르지 않습니다."));
		
		
	}
	
//	메소드 명 : public void practice6(){}
//	키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
//	그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
//	아니면 false를 출력하세요.
//	(단, num1은 num2보다 작아야 함)
//	ex.
//	정수1 : 4
//	정수2 : 11
//	입력 : 13
//	true
	
	public void practice6() {
		
		System.out.println("정수1을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.println("정수3을 입력하세요 : ");
		int num3 = sc.nextInt();
		
		System.out.println(((num3 <= num1) || (num3 > num2)));
		
	}
	
//	메소드 명 : public void practice7(){}
//	3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
//	ex.
//	입력1 : 5
//	입력2 : -8
//	입력3 : 5
//	false
	
	public void practice7() {
		
		System.out.println("숫자1을 입력하세요 : ");	
		double num1 = sc.nextDouble();
		System.out.println("숫자2를 입력하세요 : ");
		double num2 = sc.nextDouble();
		System.out.println("숫자3을 입력하세요 : ");
		double num3 = sc.nextDouble();
		
		System.out.println(((num1 == num2) && (num1 == num3)));
		
	}
	
//	메소드 명 : public void practice8(){}
//	A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
//	인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
//	(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
//	ex.
//	A사원의 연봉 : 2500
//	B사원의 연봉 : 2900
//	C사원의 연봉 : 2600
//	A사원 연봉/연봉+a : 2500/3500.0
//	3000 이상
//	B사원 연봉/연봉+a : 2900/2900.0
//	3000 미만
//	C사원 연봉/연봉+a : 2600/2989.9999999999995
//	3000 미만
	
	public void practice8() {
		
		System.out.println("A사원의 연봉을 입력하세요 : ");
		double salaryA = sc.nextDouble();
		System.out.println("B사원의 연봉을 입력하세요 : ");
		double salaryB = sc.nextDouble();
		System.out.println("C사원의 연봉을 입력하세요 : ");
		double salaryC = sc.nextDouble();
		
		double incentiveA = salaryA * 0.4; 
		double incentiveB = salaryB * 0; 
		double incentiveC = salaryC * 0.15;
		
		double overallA = salaryA + incentiveA;
		double overallB = salaryB + incentiveB;
		double overallC = salaryC + incentiveC;
		
		System.out.println("A사원의 연봉 : " + salaryA);
		System.out.println("B사원의 연봉 : " + salaryB);
		System.out.println("C사원의 연봉 : " + salaryC + "\n");
		
		
		System.out.printf("A사원 연봉/연봉+a : %.1f/%.1f\n", salaryA, overallA);
		System.out.println((overallA >= 3000) ? "3000 이상" : "3000 미만");
		System.out.printf("B사원 연봉/연봉+a : %.1f/%.1f\n", salaryB, overallB);
		System.out.println((overallB >= 3000) ? "3000 이상" : "3000 미만");
		System.out.printf("C사원 연봉/연봉+a : %.1f/%.1f\n", salaryC, overallC);
		System.out.println((overallC >= 3000) ? "3000 이상" : "3000 미만");
		
	}

}








































