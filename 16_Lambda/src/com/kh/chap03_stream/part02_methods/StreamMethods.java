package com.kh.chap03_stream.part02_methods;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethods {
	/*
	 * 스트림의 중간연산 메서드들과 최종처리 메서드들.
	 * 
	 * 자주 사용되는 중간연산 메서드
	 * 1) distinct: 중복값 제거
	 * 2) filter: 내부요소 필터링 메서드
	 * 3) map: 데이터 변환 메서드(값과 자료형 모두 변환 가능)
	 * 4) peek: 중간 확인 메서드
	 * 5) sort: 정렬 메서드
	 * ...
	 * 
	 * 최종연산 메서드들
	 * 1) Iterating 계열: forEach
	 * 2) Collecting 계열: collect(Collector.컬렉션메서드) -> 스트림의 내부 요소를 내가 원하는 계열의 컬렉션으로 변환해주는 메서드.
	 * 3) Calculating 계열: min, max, sum, average, ... -> 산술연산 관련 최종 처리 메서드.
	 * 4) Matching: anyMatch, allMatch, noneMatch, ...
	 *    -> 스트림 내부 요소에서 특정 조건을 만족하는지 검사하기 위해 사용.
	 * 5) Reduction 계열: reduce 메서드를 통해 요소 내부의 값을 다양한 방법으로 연산 후 결과값을 반환하는 메서드.
	 *                  Calculating 계열에서 제공하지 않는 기능의 연산을 수행할 때 사용.
	 */
	
	public static void main(String[] args) {
		// 1) distinct, filter, forEach
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10);
		
		Stream<Integer> stream = list.stream();
		
		stream
		.distinct()
		.filter(i -> i % 2 != 0)
		.forEach(i -> System.out.println(i));
		
		String[] names = {"강감찬", "강원래", "홍길동", "강형욱", "초난강"};
		
		Arrays.stream(names)
		.filter(n -> n.startsWith("강"))
		.forEach(System.out::println);
		
		// 2) map: 현재스트림 요소를 다른 요소로 바꾸는 메서드
		// Function<S, V> 의 apply(S): V
		
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		
		list2.stream() // Stream<Integer>
		.map(i -> i + "o") // Stream<String> 
		.forEach(System.out::println); // 값의 변환만이 아니라, 자료형까지 변환이 가능함.
		
		// 3) Collect 계열
		List<Integer> newList = list2.stream()
				.map(i -> i * 100)
				.collect(Collectors.toList());
		
		System.out.println(list2);
		System.out.println(newList);
		
		// 4) mapTo(Int/Double/Long): Stream을 기본자료형 스트림으로 변경해주는 메서드.
		//    기본자료형 스트림에만 존재하는 메서드를 사용하기 위해 변환한다.
		Arrays.stream(names) // Stream<String>
		.mapToInt(s -> s.length()) // Stream<String> -> IntStream
		.forEach(System.out::println);
		
		// 5) Collection 계열
		// 5-1) Collectors.toList(): 스트림 결과를 List로 변환
		// 5-2) Collectors.toSet(): 스트림 결과를 Set으로 변환
		List<Integer> list4 = Arrays.asList(1,2,3,4,5,4,3,2,1);
		Set<Integer> set1 = list4.stream()
//				.filter(i -> i % 2 == 0)
				.collect(Collectors.toSet());
		
		System.out.println(set1);
		
		// 5-3) Collectors.toMap(Function, Function): 스트림 결과를 Map으로 변환
		List<Integer> list5 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Map<String, Integer> map1 = list5.stream()
				.collect(Collectors.toMap(i -> i + "", i -> i));
		
		System.out.println(map1);
		
		Map<Integer, String> map2 = list5.stream()
				.collect(Collectors.toMap(i -> i, i -> i > 5 ? "hi" : "bye"));
		
		System.out.println(map2);
		
		// Calculating 계열
		// - 산술연산시 사용하는 메서드들. 기본자료형 스트림에 존재.
		// 1) sum
		int sum = IntStream.rangeClosed(1, 100).sum();
		System.out.println(sum);
		
		// 2) average
		double avg = IntStream
				.rangeClosed(1, 100)
				.average()
				.getAsDouble()
				;
		System.out.println(avg);
		
		// 3) summaryStatistic: 스트림 요소의 통계값을 가진 객체
		//    (통계값 ? 요소 총 갯수, 합, 평균, 최소, 최대)
		IntSummaryStatistics summary = IntStream
				.of(1,2,3,4,5,6,7,8,9,10)
				.summaryStatistics();
		
		System.out.println(summary);
		System.out.println(summary.getAverage());
		
		// Reduction 계열
		// reduce(초기값, 초기값을 처리하는 람다식)
		int result3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10)
		.stream().reduce(0, (sum2, n) -> { // 첫번째 매개변수: 초기값을 저장하는 변수. 두번째: 스트림 내부 요소.
			System.out.println("sum2: " + sum2);
			System.out.println("n: " + n);
			return sum2 + n; // 반환값: 초기값으로 다시 전달
		});
		
		System.out.println(result3);
		
		int result4 = Arrays.asList(1,2,3,44,4,5,6,7,8,9,10).stream()
		.reduce(0, (max, n) -> {
//			if (n > max) {
//				return n;
//			} else {
//				return max;
//			}
			
			return n > max ? n : max;
		});
		
		System.out.println(result4);
		
		class Member {
			String name;
			int age;
			
			public String getName() {
				return name;
			}
			
			public void setName(String name) {
				this.name = name;
			}
			
			public int getAge() {
				return age;
			}
			
			public void setAge(int age) {
				this.age = age;
			}
			
			public Member(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}
			
			@Override
			public String toString() {
				return "Member [name=" + name + ", age=" + age + "]";
			}
		}
		
		List<Member> arr = Arrays.asList(
				new Member("홍길동", 35), new Member("신사임당", 40), new Member("세종", 45),
				new Member("홍난파", 80), new Member("전달력", 69));
		
		Member maxAgePerson = arr.stream().reduce((p1, p2) -> { // 초기값을 생략시 스트림의 첫번째 요소가 p1에 추가.
			return p1.getAge() > p2.getAge() ? p1 : p2;
		}).get();
		
		System.out.println(maxAgePerson);
		
		// Member 객체에서 나이의 합 구하기.
		int ageSum = arr.stream()
				.map(m -> m.getAge())
				.reduce(0, (init, age) -> {
			return init += age;
		});
		System.out.println(ageSum);
		
		System.out.println("=============================================================");
		
		// Matching 계열
		// 1) anyMatch: 스트림의 요소들중 하나라도 true 가 나오면 true.
		boolean bool1 = Arrays.asList("1", "b2", "c", "b4", "5")
				.stream().anyMatch(str -> str.startsWith("b"));
		
		System.out.println(bool1);
		
		// 2) noneMatch: 스트림의 요소 모두가 false 면 true
		boolean bool2 = Arrays.asList("홍길동", "123", "가나다")
				.stream().noneMatch(str -> str.length() > 4);
		
		System.out.println(bool2);
		
		boolean bool3 = Arrays.asList("강감찬", "한종윤", "김도레미")
				.stream().allMatch(str -> str.length() <= 3);
		
		System.out.println(bool3);
		
		// 4) findFirst: 스트림 요소중 조건을 만족하는 첫번째 요소를 찾은 후 반환.
		String str = Arrays.asList("홍길동", "한종윤", "111", "11111", "1가나다")
				.stream().filter(s -> s.startsWith("1111")) // 11111
				.findFirst().get();
		
		System.out.println(str);
		
		// 5) findAny: 스트림 요소가 하나라도 존재한다면 해당 요소를 즉시 반환
		str = Arrays.asList("홍길동2", "123", "ㅎㅎㅎㅎㅎ")
				.stream().filter(s -> s.length() <= 4)
				.findAny().get();
		
		System.out.println(str);
		
	}
	
}































