package com.kh.practice.snack.model.vo;

public class Snack {
	// field
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	// constructors
	public Snack() {
		
	}
	
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	// methods	
	public String information() {
		return this.kind + "(" + this.name + " - " + this.flavor + ") " + this.numOf + "개 " + this.price + "원"; 
	}
	
	// setter	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// getter
	public String getKind() {
		return this.kind;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getFlavor() {
		return this.flavor;
	}
	
	public int getNumOf() {
		return this.numOf;
	}
	
	public int getPrice() {
		return this.price;
	}
	
}







































