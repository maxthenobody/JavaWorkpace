package com.kh.chap03_generic.model.vo;

public class Generic2<T /*extends Parent*/> { // 제네릭으로 Parent 와 Parent 를 상속받은 클래스만 올 수 있다는 뜻.
	
	private T t;
	
	public void printing() {
//		t.doPrint();
	}
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
}
