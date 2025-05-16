package com.kh.chap02_lambda.practice;

@FunctionalInterface
public interface MyFunction<V, X> {
	X apply(V v);
}
