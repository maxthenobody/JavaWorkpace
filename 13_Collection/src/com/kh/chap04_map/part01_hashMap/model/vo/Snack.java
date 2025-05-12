package com.kh.chap04_map.part01_hashMap.model.vo;

import java.util.Objects;

public class Snack {
	private String flavor;
	private int calorie;
	
	public Snack() {
		
	}

	public Snack(String flavor, int calorie) {
		super();
		this.flavor = flavor;
		this.calorie = calorie;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calorie=" + calorie + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(calorie, flavor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snack other = (Snack) obj;
		return calorie == other.calorie && Objects.equals(flavor, other.flavor);
	}
	
	
	
}




















