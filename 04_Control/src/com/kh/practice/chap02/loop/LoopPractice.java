package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
//	메소드 명 : public void practice1(){}
//	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//	단, 입력한 수는 1보다 크거나 같아야 합니다.
//	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//	ex.
//	1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
//	1 2 3 4 1 이상의 숫자를 입력해주세요.
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("1이상의 숫자를 입력하세요(1이상): ");
		int input = sc.nextInt();
		
		if (input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}
		
		for (int i = 1; i <= input; i++) {
			System.out.print(i + " ");
		}
		
	}
	
//	메소드 명 : public void practice2(){}
//	위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//	ex.
//	1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
//	1 2 3 4 1 이상의 숫자를 입력해주세요.
//	1이상의 숫자를 입력하세요 : 8
//	1 2 3 4 5 6 7 8 
	
	public void practice2() {
		
		boolean condition = true;
		while (condition) {
			System.out.print("1이상의 숫자를 입력해주세요: ");
			int input = sc.nextInt();
			
			if (input < 1) {
				continue;
			}
			
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
//				break;
			}
			condition = false;
		}
		
	}
	
//	메소드 명 : public void practice3(){}
//	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//	단, 입력한 수는 1보다 크거나 같아야 합니다.
//	ex.
//	1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
//	4 3 2 1 1 이상의 숫자를 입력해주세요.
	
	public void practice3() {
		
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		if (input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			return;
		}
		
		for (int i = input; i > 0; i--) {
			System.out.print(i + " ");
		}
		
	}
	
//	메소드 명 : public void practice4(){}
//	위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//	ex.
//	1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
//	4 3 2 1 1 이상의 숫자를 입력해주세요.
//	1이상의 숫자를 입력하세요 : 8
//	8 7 6 5 4 3 2 1
	
	public void practice4() {
		
		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요: ");
			int input = sc.nextInt();
			
			if (input < 1) {
				continue;
			}
			
			for (int i = input; i > 0; i--) {
				System.out.print(i + " ");
			}
			break;
		}
		
	}
	
//	메소드 명 : public void practice5(){}
//	1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
//	ex.
//	정수를 하나 입력하세요 : 8
//	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	
	public void practice5() {
		System.out.print("정수를 하나 입력하세요: ");
		int input = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= input; i++) {
			System.out.print(i + (i == input ? " = " : " + "));
			sum += i;
		}
		
		System.out.println(sum);
	}
	
//	메소드 명 : public void practice6(){}
//	사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//	ex.
//	첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
//	두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
//	4 5 6 7 8 4 5 6 7 8 1 이상의 숫자를 입력해주세요.
	
	public void practice6() {
		System.out.print("첫 번째 숫자: ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자: ");
		int input2 = sc.nextInt();
		
		if (input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}
		
		if (input1 < input2) {
			for (int i = input1; i <= input2; i++) {
				System.out.print(i + " ");
			}
		}
		else {
			for (int i = input2; i <= input1; i++) {
				System.out.print(i + " ");
			}
		}
		
	}
	
//	메소드 명 : public void practice7(){}
//	위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//	ex.
//	첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
//	두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
//	4 5 6 7 8 4 5 6 7 8 1 이상의 숫자를 입력해주세요.
//	첫 번째 숫자 : 6
//	두 번째 숫자 : 2
//	2 3 4 5 6 
	
	public void practice7() {
		
		while (true) {
			System.out.print("첫 번째 숫자: ");
			int input1 = sc.nextInt();
			System.out.print("두 번째 숫자: ");
			int input2 = sc.nextInt();
			
			if (input1 < 1 || input2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				continue;
			}
			
			if (input1 < input2) {
				for (int i = input1; i <= input2; i++) {
					System.out.print(i + " ");
				}
				break;
			}
			else {
				for (int i = input2; i <= input1; i++) {
					System.out.print(i + " ");
				}
				break;
			}
		}
		
		
	}
	
//	메소드 명 : public void practice8(){}
//	사용자로부터 입력 받은 숫자의 단을 출력하세요.
//	ex.
//	숫자 : 4
//	===== 4단 =====
//	4 * 1 = 4
//	4 * 2 = 8
//	4 * 3 = 12
//	4 * 4 = 16
//	4 * 5 = 20
//	4 * 6 = 24
//	4 * 7 = 28
//	4 * 8 = 32
//	4 * 9 = 36
	
	public void practice8() {
		System.out.print("숫자: ");
		int input = sc.nextInt();
		
		System.out.println("===== " + input + "단 =====");
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", input, i, input * i);
		}
	}
	
//	메소드 명 : public void practice9(){}
//	사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//	단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
//	숫자 : 4 숫자 : 10
//	===== 4단 ===== 9 이하의 숫자만 입력해주세요.
//	===== 5단 =====
//	===== 6단 =====
//	===== 7단 =====
//	===== 8단 =====
//	===== 9단 =====
//	(해당 단의 내용들은 길이 상 생략)
	
	public void practice9() {
		System.out.print("숫자: ");
		int input = sc.nextInt();
		
		if (input > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요");
			return;
		}
		
		for (int i = input; i < 10; i++) {
			System.out.println("===== " + i + "단 =====");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}
	
//	메소드 명 : public void practice10(){}
//	위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
//	“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//	숫자 : 4 숫자 : 10
//	===== 4단 ===== 9 이하의 숫자만 입력해주세요.
//	===== 5단 ===== 숫자 : 8
//	===== 6단 ===== ===== 8단 =====
//	===== 7단 ===== ===== 9단 =====
//	===== 8단 =====
//	===== 9단 =====
//	(해당 단의 내용들은 길이 상 생략)
	
	public void practice10() {
		while (true) {
			System.out.print("숫자: ");
			int input = sc.nextInt();
			
			if (input > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요");
				continue;
			}
			
			for (int i = input; i < 10; i++) {
				System.out.println("===== " + i + "단 =====");
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
			break;
		}
	}
	
//	메소드 명 : public void practice11(){}
//	사용자로부터 시작 숫자와 공차를 입력 받아
//	일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//	단, 출력되는 숫자는 총 10개입니다.
//	* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
//	ex) 2, 7, 12, 17, 22 …
//	5 5 5 5 => 여기서 공차는 5
//	ex.
//	시작 숫자 : 4
//	공차 : 3
//	4 7 10 13 16 19 22 25 28 31
	
	public void practice11() {
		System.out.print("시작 숫자: ");
		int start = sc.nextInt();
		System.out.print("공차: ");
		int gongcha = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(start + " ");
			start += gongcha;
		}
	}
	
//	메소드 명 : public void practice12(){}
//	정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//	단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
//	exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//	또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//	“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//	없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
//	두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
//	연산자(+, -, *, /, %) : +
//	정수1 : 10
//	정수2 : 4
//	10 + 4 = 14
//	연산자(+, -, *, /, %) : / 연산자(+, -, *, /, %) : /
//	정수1 : 10 정수1 : 10
//	정수2 : 4 정수2 : 0
//	10 / 4 = 2 0으로 나눌 수 없습니다. 다시 입력해주세요.
//	연산자(+, -, *, /, %) : ^ 연산자(+, -, *, /, %) : exit
//	정수1 : 10 프로그램을 종료합니다.
//	정수2 : 4
//	없는 연산자입니다. 다시 입력해주세요.
	
	public void practice12() {
		while (true) {
			System.out.print("연산자(+, -, *, /, %): ");
			String strInput = sc.nextLine();
			
			if (strInput.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			char operator = strInput.charAt(0);
			System.out.print("정수1: ");
			int input1 = sc.nextInt();
			System.out.print("정수2: ");
			int input2 = sc.nextInt();
			
			
			if (operator == '/' && input2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				sc.nextLine();
				continue;
			}
			
//			if (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%') {
//				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
//				continue;
//			}
			
			switch (operator) {
			case '+':
				System.out.printf("%d %c %d = %d\n", input1, operator, input2, input1 + input2);
				break;
			case '-':
				System.out.printf("%d %c %d = %d\n", input1, operator, input2, input1 - input2);
				break;
			case '*':
				System.out.printf("%d %c %d = %d\n", input1, operator, input2, input1 * input2);
				break;
			case '/':
				System.out.printf("%d %c %d = %d\n", input1, operator, input2, input1 / input2);
				break;
			case '%':
				System.out.printf("%d %c %d = %d\n", input1, operator, input2, input1 % input2);
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
			
			sc.nextLine();
		}
	}
	
//	메소드 명 : public void practice13(){}
//	다음과 같은 실행 예제를 구현하세요.
//	ex.
//	정수 입력 : 4
//	*
//	**
//	***
//	****
	
	public void practice13() {
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	메소드 명 : public void practice14(){}
//	다음과 같은 실행 예제를 구현하세요.
//	ex.
//	정수 입력 : 4
//	****
//	***
//	**
//	*
	
	public void practice14() {
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		
		for (int i = input; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}









































