package com.deloitte.corejava;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

abstract class MyClass{
	//non-abstract methods
	//abstract method
	//constructor
	//varaibles..
}
@FunctionalInterface
interface Greet{
	void greet(String message);
	
	public default void m1() {
		System.out.println("M1 method");
	}
}
public class Greeting {
	
	
	public static void main(String[] args) {
		BiPredicate<String, String> biPredicate = (str1, str2)-> str1.length()==str2.length();
		boolean test = biPredicate.test("Manga Rao", "Ranga");
		System.out.println(test);
		
		BiFunction<Integer,Integer,Integer> biFunction = (num1, num2) ->  num1+num2;
		Integer sum = biFunction.apply(100,200);
		System.out.println(sum);
	}

}
