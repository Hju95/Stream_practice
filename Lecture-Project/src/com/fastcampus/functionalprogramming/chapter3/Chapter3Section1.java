package com.fastcampus.functionalprogramming.chapter3;

import java.util.function.Function;

import com.fastcampus.functionalprogramming.chapter3.util.Adder;

public class Chapter3Section1 {

	public static void main(String[] args) {
		Function<Integer, Integer> myAdder = new Adder();
		int result = myAdder.apply(5);
		System.out.println(result);
	}
// 매번 Adder 처럼 클래스를 만들어줘서 써야하는건가? 라는 의문이 들 수 있음 -> Section2
}
