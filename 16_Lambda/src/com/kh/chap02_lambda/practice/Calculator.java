package com.kh.chap02_lambda.practice;

public interface Calculator<V> {
	V operate(V v, V x);
}
