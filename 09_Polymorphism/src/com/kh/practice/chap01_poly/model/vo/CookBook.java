package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {
	private boolean coupon; // 요리학원쿠폰유무
	
	public CookBook() {
		
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		// TODO Auto-generated constructor stub
		this.coupon = coupon;
	}

	@Override
	public String toString() {
//		return "CookBook [coupon=" + coupon + ", toString()=" + super.toString() + "]";
		return super.toString() + " / " + coupon;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
	
}
