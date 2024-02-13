package com.fastcampus.functionalprogramming.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Chapter4Section2 {
	public static void main(String[] args) {
		Consumer<String> myStringConsumer = (String str) -> 
			System.out.println(str);
		myStringConsumer.accept("hello");
		myStringConsumer.accept("world");
		
		List<Integer> integerInputs = Arrays.asList(4, 2, 3); //이미 생성되어있는 배열을 list 형태로 전환할 때 자주 사용. asList 는 add 하면 에러남
		Consumer<Integer> myIntegerProcessor = x -> 
			System.out.println("Processing integer " + x);
		process(integerInputs, myIntegerProcessor);

		Consumer<Integer> myDifferentIntegerProcessor = x -> 
			System.out.println("Processing integer in different way " + x);
		process(integerInputs, myDifferentIntegerProcessor);
		
		Consumer<Double> myDoubleProcessor = x ->
			System.out.println("Processing double " + x);
		List<Double> doubleInputs = Arrays.asList(1.1, 2.2, 3.3);
		process(doubleInputs, myDoubleProcessor);
	}
	
	public static <T> void process(List<T> inputs, Consumer<T> processor) {
		for (T input : inputs) {
			processor.accept(input);
		}
	}
}
