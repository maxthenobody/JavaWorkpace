package com.kh.chap02_lambda.model.functional;

// 함수형 인터페이스로 사용되는 인터페이스는 내부적으로 추상메서드가 딱 하나만 있다.
@FunctionalInterface
public interface LambdaTest1 {
	
	int add(int x, int y);
}
