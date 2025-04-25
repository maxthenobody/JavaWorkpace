package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
//	메소드 명 : public void practice1(){}
//	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//	순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//	ex.
//	1 2 3 4 5 6 7 8 9 10
	
	public void practice1() {
		
		int[] iArr = new int[10];
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i+1;
		}
		
		System.out.println(Arrays.toString(iArr));
		
	}
	
//	메소드 명 : public void practice2(){}
//	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//	역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//	ex.
//	10 9 8 7 6 5 4 3 2 1
	
	public void practice2() {
		
		int[] iArr = new int[10];
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = 10-i;
		}
		
		System.out.println(Arrays.toString(iArr));
		
	}
	
//	메소드 명 : public void practice3(){}
//	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//	ex.
//	양의 정수 : 5
//	1 2 3 4 5
	
	Scanner sc = new Scanner(System.in);
	
	public void practice3() {
		
		System.out.print("양의 정수: ");
		int input = sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			System.out.print(i+1 + " ");
		}
		
	}
	
//	메소드 명 : public void practice4(){}
//	길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//	배열 인덱스를 활용해서 귤을 출력하세요.
//	ex.
//	귤
	
	public void practice4() {
		
		String[] strArr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(strArr[1]);
		
		
	}
	
//	메소드 명 : public void practice5(){}
//	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//	ex.
//	문자열 : application
//	문자 : i
//	application에 i가 존재하는 위치(인덱스) : 4 8
//	i 개수 : 2
	
	public void practice5() {
		
		System.out.print("문자열: ");
		String input = sc.nextLine();
		
		char[] chArray = new char[input.length()];
		
		for (int i = 0; i < input.length(); i++) {
			chArray[i] = input.charAt(i);
		}
		
//		System.out.println(input);
//		return;
		
		for (int i = 0; i < chArray.length; i++) {
			
			char ch = chArray[i];
			
			System.out.print("문자: " + ch + "\n");
			System.out.print(input + "에 " + ch + "가 존재하는 위치(인덱스): ");
			
			int count = 0;						
			for (int j = 0; j < chArray.length; j++) {
				char ch2 = chArray[j];
				if (ch2 == ch) {
					System.out.print(j + " ");
					count++;
				}
			}
			
			System.out.println();
			System.out.println(ch + " 개수: " + count);
			
			System.out.println("===============================");
			
		}
		
	}
	
//	메소드 명 : public void practice6(){}
//	“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//	입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//	범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//	ex.
//	0 ~ 6 사이 숫자 입력 : 4 0 ~ 6 사이 숫자 입력 : 7
//	금요일 잘못 입력하셨습니다.
	
	public void practice6() {
		
		char[] weekdays = {'월', '화', '수', '목', '금', '토', '일'};
		
		System.out.print("0 ~ 6 사이 숫자 입력: ");
		int input = sc.nextInt();
		
		switch (input) {
		case 0:
			System.out.println(weekdays[0] + "요일");
			break;
		case 1:
			System.out.println(weekdays[1] + "요일");
			break;
		case 2:
			System.out.println(weekdays[2] + "요일");
			break;
		case 3:
			System.out.println(weekdays[3] + "요일");
			break;
		case 4:
			System.out.println(weekdays[4] + "요일");
			break;
		case 5:
			System.out.println(weekdays[5] + "요일");
			break;
		case 6:
			System.out.println(weekdays[6] + "요일");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");	
		}
		
	}
	
//	메소드 명 : public void practice7(){}
//	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//	ex.
//	정수 : 5
//	배열 0번째 인덱스에 넣을 값 : 4
//	배열 1번째 인덱스에 넣을 값 : -4
//	배열 2번째 인덱스에 넣을 값 : 3
//	배열 3번째 인덱스에 넣을 값 : -3
//	배열 4번째 인덱스에 넣을 값 : 2
//	4 -4 3 -3 2
//	총 합 : 2
	
	public void practice7() {
		
		System.out.print("정수: ");
		int arrSize = sc.nextInt();
		int[] iArray = new int[arrSize];
		
		int sum = 0;
		for (int i = 0; i < iArray.length; i++) {
			
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
			iArray[i] = sc.nextInt();
			sum += iArray[i];
		}
		
		for (int i : iArray) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("총 합: " + sum);
		
	}
	
//	메소드 명 : public void practice8(){}
//	3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//	다시 정수를 받도록 하세요.
//	ex.
//	정수 : 4
//	다시 입력하세요.
//	정수 : -6
//	다시 입력하세요.
//	정수 : 5
//	1, 2, 3, 2, 1
	
	public void practice8() {
		
		System.out.print("정수(홀수, 3이상): ");
		int input = sc.nextInt();
		
		if (input < 3) {
			practice8();
		}
		
		int count = input * 2 - 1;
		
		int[] iArr = new int[count];
		
		int start = 1;
		
//		if (start < input) {			
//			start++;
//		}
		
		
		for (int i = 0; i < count; i++) {
			
			iArr[i] = start;
			
			if (start < input) {
				start++;
			}
			else {
				break;
			}			
		}
		
		for (int i = input - 1; i < count; i++) {
			iArr[i] = start--;
		}		
		
		System.out.println(Arrays.toString(iArr));		
	}
	
//	메소드 명 : public void practice9(){}
//	사용자가 입력한 값이 배열에 있는지 검색하여
//	있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//	단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//	ex.
//	치킨 이름을 입력하세요 : 양념 치킨 이름을 입력하세요 : 불닭
//	양념치킨 배달 가능 불닭치킨은 없는 메뉴입니다.
	
	public void practice9() {
		
		String[] menu = {"양념", "후라이드"};
		
//		System.out.println(Arrays.toString(menu));
		
		System.out.print("치킨 이름을 입력하세요: ");
		String order = sc.nextLine();
		
		int sum = 0;
		for (String str : menu) {
			if (str.equals(order)) {
				System.out.println(str + "치킨 배달 가능");
				sum++;
			}
		}
		
		if (sum == 0) {
			System.out.println(order + "치킨은 없는 메뉴입니다.");
		}
		
	}
	
//	메소드 명 : public void practice10(){}
//	주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
//	단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
//	ex.
//	주민등록번호(-포함) : 123456-1234567
//	123456-1******
	
	public void practice10() {
		
		System.out.print("주민등록번호(-포함): ");
		String idNum = sc.nextLine();
		
//		char[] idNumArr = new char[idNum.length()];
		
//		for (int i = 0; i < idNum.length(); i++) {			
//			idNumArr[i] = idNum.charAt(i);
//		}
		
		char[] idNumArr = idNum.toCharArray();
		
//		for (char c : idNumArr) {
//			System.out.print(c);
//		}
		
		char[] copy = idNumArr.clone();
		
		for (int i = 0; i < copy.length; i++) {
			if (i >= 8) {
				copy[i] = '*';
			}
		}
		
//		System.out.println();
		
		for (char c : copy) {
			System.out.print(c);
		}
		
	}
	
//	메소드 명 : public void practice11(){}
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
//	ex.
//	9 7 6 2 5 10 7 2 9 6
	
	public void practice11() {
		
		int[] iArr = new int[10];
		
		for (int i = 0; i < iArr.length; i++) {
			
			iArr[i] = (int)(Math.random()*10 + 1);
			
		}
		
		for (int v : iArr) {
			System.out.print(v + " ");
		}
		
	}
	
//	메소드 명 : public void practice12(){}
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 배열에 초기화 후
//	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//	ex.
//	5 3 2 7 4 8 6 10 9 10
//	최대값 : 10
//	최소값 : 2
	
	public void practice12() {
		
		int[] iArr = new int[10];
		
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = (int)(Math.random()*10 + 1);
			
			if (i == 0) {
				min = iArr[i];
				max = iArr[i];
			}
			else {
				if (iArr[i] < min) {
					min = iArr[i];
				}
				
				if (iArr[i] > max) {
					max = iArr[i];
				}
			}
		}
		
		for (int i : iArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
	}
	
//	메소드 명 : public void practice13(){}
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//	ex.
//	4 1 3 6 9 5 8 10 7 2
	
	public void practice13() {
		
		int[] iArr = new int[10];
		
		for (int i = 0; i < iArr.length; i++) {
			
			loop1:
			while (true) {
				int random = (int)(Math.random()*10 + 1);
				int count = 0;
				
				for (int j = 0; j < iArr.length; j++) {
					
					if (random == iArr[j]) {
						count++;
					}
				}
				
				if (count == 0) {
					iArr[i] = random;
					break loop1;
				}
			}
//			int random = (int)(Math.random()*10 + 1);
			
			
		}
		
		for (int i : iArr) {
			System.out.print(i + " ");
		}
		
	}
	
//	메소드 명 : public void practice14(){}
//	로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
//	ex.
//	3 15 4 28 17 40
	
	public void practice14() {
		
		int[] lotto = new int[6];
//		System.out.println("hi");
		
		for (int i = 0; i < lotto.length; i++) {
			while (true) {
				
				int random = (int)(Math.random()*45 + 1);
				
				int count = 0;
				
				for (int v : lotto) {
					if (v == random) {
//						System.out.println(v);
						count++;
					}
				}
				
				if (count == 0) {
					lotto[i] = random;
					break;
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;					
				}
			}
		}
		
		for (int i : lotto) {
			System.out.print(i + " ");
		}		
		
	}
	
//	메소드 명 : public void practice15(){}
//	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//	문자의 개수와 함께 출력하세요.
//	ex.
//	문자열 : application
//	문자열에 있는 문자 : a, p, l, i, c, t, o, n
//	문자 개수 : 8
	
	public void practice15() {
		
		System.out.print("문자열: ");
		String input = sc.nextLine();
		char[] inputArr = input.toCharArray();
		char[] emptyArr = new char[1];
		int emptyArrLen = emptyArr.length;
		
		System.out.print("문자열에 있는 문자: ");
		
		for (int i = 0; i < inputArr.length; i++) {
			char c = inputArr[i];
			
			int count = 0;
			for (int j = 0; j < emptyArr.length; j++) {
				char cc = emptyArr[j];
				if (c == cc) {
					count++;
				}
			}
			
			if (count == 0) {
				emptyArr[emptyArrLen-1] = c;
				char[] tempArr = emptyArr.clone();
				emptyArr = new char[emptyArrLen + 1];
				for (int k = 0; k < tempArr.length; k++) {
					emptyArr[k] = tempArr[k];
				}
				emptyArrLen++;
			}
			
			int uniqueCount = 0;
			for (int j = 0; j < emptyArr.length; j++) {
				char cc = emptyArr[j];
				if (c == cc) {
					uniqueCount++;
				}
			}						
			
			if (uniqueCount == 0) {
				System.out.print(c + " ");
			}
		}		
		
		for (char c : emptyArr) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		System.out.print("문자 개수: " + (emptyArr.length - 1));		
	}
	
//	메소드 명 : public void practice16(){}
//	사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//	배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//	단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//	늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//	사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
//	ex.
//	배열의 크기를 입력하세요 : 3
//	1번째 문자열 : 자바의 정석
//	2번째 문자열 : 알고리즘
//	3번째 문자열 : C프로그래밍
//	더 값을 입력하시겠습니까?(Y/N) : y
//	더 입력하고 싶은 개수 : 2
//	4번째 문자열 : 인간관계
//	5번째 문자열 : 자기계발
//	더 값을 입력하시겠습니까?(Y/N) : y
//	더 입력하고 싶은 개수 : 1
//	6번째 문자열 : 영단어600
//	더 값을 입력하시겠습니까?(Y/N) : n
//	[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
	
//	public void practice16() {
//		
////		if (runCount == 0) {
////			int totalLen = 0;			
////		}
//		int totalLen = 0;
//		System.out.print("배열의 크기를 입력하세요: ");
//		int input = sc.nextInt();
//		totalLen += input;
//		String[] totalArr = new String[totalLen];
//		
//		while (true) {			
//			sc.nextLine();			
//			
//			String[] currentArr = new String[input];
//			for (int i = 0; i < input; i++) {
//				System.out.print((totalLen - input + i) + "번째 문자열: ");
//				currentArr[i] = sc.nextLine();
//			}
//			
//			String[] currentClone = currentArr.clone();
//			
//			totalArr = new String[totalLen];
//			
//			for (int i = 0; i < )
//				
//			Arrays.
//			
//			String[] clone = currentArr.clone();		
////			currentArr = new String[totalLen];
//			
////			String[] totalArr = new String[totalLen];
//			
//			for (int i = totalLen - input; i < totalLen; i++) {
////				System.out.print((i+1) + "번째 문자열: ");
//				strArr[i] = sc.nextLine();
//			}
//			
//			System.out.print("더 값을 입력하시겠습니다?(Y/N): ");
//			char yORn = sc.nextLine().charAt(0);
//			
//			if (yORn == 'N' || yORn == 'n') {
//				System.out.println(Arrays.toString(totalArr));
//				break;
//			}
//			
//			System.out.print("더 입력하고 싶은 개수: ");
//			
//			input = sc.nextInt();
//			totalLen += input;
//			
//			currentArr = new String[totalLen];
//		}
//		
//	}
	
	public void practice16() {
		System.out.print("배열의 크기를 입력하세요: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] str = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.printf("%d번째 문자열: ", i+1);
			str[i] = sc.nextLine();
		}
		
		while (true) {
			System.out.print("더 값을 입력하시겠습니다?(Y/N): ");
			char ch = sc.nextLine().toLowerCase().charAt(0);
			
			if (ch == 'n') {
				System.out.println(Arrays.toString(str));
				return;
			}
			
			System.out.print("더 입력하고 싶은 개수: ");
			int moreSize = sc.nextInt();
			sc.nextLine();
			
			String[] copy = new String[str.length + moreSize];
			System.arraycopy(str, 0, copy, 0, str.length); // 깊은복사 완료
			
			for (int i = str.length; i < copy.length; i++) {
				System.out.printf("%d 번째 문자열: ", i+1);
				copy[i] = sc.nextLine();
			}
			str = copy;
		}	
		
	}
	
	
}











































