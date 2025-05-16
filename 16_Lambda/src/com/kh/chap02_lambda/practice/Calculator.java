package com.kh.chap02_lambda.practice;

@FunctionalInterface
public interface Calculator<V> {
	V operate(V v, V x);
}
