package com.deloitte.corejava;

import java.util.function.BiFunction;

@FunctionalInterface
interface Hi {

	void sayHi();

}

@FunctionalInterface
interface Interface1 {

	MethodRefEx getMyInstance();

}

public class MethodRefEx {
	
	public MethodRefEx() {
		System.out.println("Constructor is invoked");
		
	}

	public static void m1() {
		System.out.println("M1 method");
	}

	public void m2() {
		System.out.println("M2 Method");
	}

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static void main(String[] args) {
		Hi hi = MethodRefEx::m1; // Refer static method
		hi.sayHi();
		/*
		 * BiFunction<Integer, Integer, Integer> biFun = new MethodRefEx()::sum; //
		 * Refer Non static method Integer apply = biFun.apply(10, 20);
		 * System.out.println(apply);
		 */
		
		Interface1 i1 = MethodRefEx::new;
		MethodRefEx myInstance = i1.getMyInstance();
		myInstance.m2();
		

	}

}
