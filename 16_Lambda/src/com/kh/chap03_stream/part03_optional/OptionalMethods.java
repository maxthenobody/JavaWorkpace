package com.kh.chap03_stream.part03_optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMethods {
	/*
	 * Optional - 스트림에서 null(비어있는 값) 값을 안전하게 다루기 위한 클래스. - 즉, 존재할 수도 있고 안 할수도 있는 객체를
	 * 다루기 위한 클래스. - Optional 로 다루게 될 변수는 변수명에 암묵적으로 Optional 임을 나타내는 키워드를 추가해야 한다.
	 * ex) maybeXXX, optXXX
	 * 
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신사", null, "");
		list.stream()
		.forEach(s -> {
			System.out.println(s + ": " + getStrLength(s));
		});
		
		Member member = new Member();
		member.setEmail("rudals@naver.com");
		// id 생략 = null;
		Order order = new Order();
		order.setMember(member);
		// count 생략 = 0;
		System.out.println(getEmailOfMember(order));
		System.out.println(getEmailOfMember(null));
		System.out.println(getEmailOfMember(new Order()));
		
		Member mem2 = new Member();
		Order order2 = new Order();
		order2.setMember(mem2);
		
		System.out.println(getEmailOfMember(order2));
		
	}
	
	public static String getEmailOfMember(Order order) {
		// 사용자의 email을 "안전하게" 얻어 오기 (defensive coding)
//		if (order != null && order.getMember() != null) {
////			Member m = order.getMember();
////			if (m != null) {
////				return m.getEmail();
////			}
//			return order.getMember().getEmail();
//		}
//		
//		return null;
		
		// 옵셔널을 통한 null 값 처리
		return Optional.ofNullable(order)
		.map(or -> or.getMember())
		.map(mem -> mem.getEmail())
		.orElse("메일이 존재하지 않습니다.");
	}
	
	public static int getStrLength(String str) {
		// Optional 을 통해 null 처리
		// Optional 객체 생성
		// 1. Optional.empty(): 비어있는 옵셔널 객체
		// 2. Optional.of(obj): null이 아닌 객체를 담은 옵셔널 객체
		// 3. Optional.ofNullable(obj): null 일수도 있는 객체를 담은 옵셔널 객체
		Optional<String> optStr = Optional.ofNullable(str);
		return optStr.map(s -> s.length())
//				.orElse(0); // s가 null인 경우
				.orElseGet(() -> 0); // s가 null인 경우 사용할 람다식
//				.orElseThrow(() -> new RuntimeException("으앙")); // s가 null일 경우 호출할 에러
	}

	static class Order {
		Member member;
		int count;

		public Order() {
		}

		public Member getMember() {
			return member;
		}

		public void setMember(Member member) {
			this.member = member;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public Order(Member member, int count) {
			super();
			this.member = member;
			this.count = count;
		}

		@Override
		public String toString() {
			return "Order [member=" + member + ", count=" + count + "]";
		}
	}

	static class Member {
		String id;
		String email;

		public Member() {
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Member(String id, String email) {
			super();
			this.id = id;
			this.email = email;
		}

		@Override
		public String toString() {
			return "Member [id=" + id + ", email=" + email + "]";
		}
	}
}
