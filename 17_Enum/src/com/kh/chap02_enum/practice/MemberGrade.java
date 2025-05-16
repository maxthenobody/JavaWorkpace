package com.kh.chap02_enum.practice;

import java.util.Arrays;

public enum MemberGrade {
	BASIC(5),
	SILVER(10),
	GOLD(20),
	VIP(30);
	
	private int discountInfo;
	
	private MemberGrade(int discountInfo) {
		this.discountInfo = discountInfo;
	}

	public String getDiscountInfo() {
		return this.name() + " 등급 할인율: " + discountInfo + "%";
	}
	
	public static MemberGrade valueOfGrade(String grade) {
		return Arrays.stream(values()).filter(v -> v.name().equals(grade)).findFirst().orElseThrow(() -> new RuntimeException("으앙"));
	}
	
//
//	public void setDiscountInfo(int discountInfo) {
//		this.discountInfo = discountInfo;
//	}
	
//	public abstract void getDiscountInfo();
}
