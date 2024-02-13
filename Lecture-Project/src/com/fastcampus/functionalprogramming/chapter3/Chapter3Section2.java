package com.fastcampus.functionalprogramming.chapter3;

import java.util.function.Function;

public class Chapter3Section2 {

	public static void main(String[] args) {
		// 생략 전
//		Function<Integer, Integer> myAdder = (Integer x) -> {
//			return x + 10;
//		};

		// 생략의 조건
		// 1. 매개변수의 타입이 유추 가능한 경우 타입 생략 가능
		// 2. 매개변수가 하나일 경우 괄호 생략 가능
		// 3. 바로 리턴하는 경우 중괄호 생략 가능

		// 생략 후
		Function<Integer, Integer> myAdder = x -> x + 10; //myAdder 는 상자라고 생각하면 된다. 안에 메서드는 이름이 없다
		int result = myAdder.apply(5);
		System.out.println(result);
	}
// 2개 인자를 받아오고 싶다면? -> Section3
}
