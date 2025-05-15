package com.kh.chap01_innerClass.part01_run;

import com.kh.chap01_innerClass.part02_static.model.vo.Member;

public class Run {
	public static void main(String[] args) {
//		OuterClass oc = new OuterClass();
//		OuterClass.InnerClass inner = new OuterClass().new InnerClass(); // public inner class 일때 가능.
//		oc.method();
//		System.out.println(OuterClass.InnerClass.sNum);
		
		Member m = new Member
				.Builder()
				.setId("max")
				.setName("한종윤")
				.setAge(36)
				.build();
	}
}
