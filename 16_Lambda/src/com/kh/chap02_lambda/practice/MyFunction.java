package com.kh.chap02_lambda.practice;

public interface MyFunction<V, X> {
	X apply(V v);
}
