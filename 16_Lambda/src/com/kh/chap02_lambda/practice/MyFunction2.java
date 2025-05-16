package com.kh.chap02_lambda.practice;

@FunctionalInterface
public interface MyFunction2<V, X> {
	void accept(V v, X x);
}
