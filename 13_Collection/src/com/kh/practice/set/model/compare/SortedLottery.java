package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		return (((Lottery)o1).getName() + ((Lottery)o1).getPhone()).compareTo((((Lottery)o2).getName()) + ((Lottery)o2).getPhone());
	}
}
