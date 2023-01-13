package com.deloitte.corejava;

interface Father{
	void m1();
}

interface Mother{
	void m1();
}

class A1 implements Father, Mother{
	@Override
	public void m1() {
		System.out.println("M1 method is called..");
		
	}
	
}

public class TestInterface {
	
	public static void main(String[] args) {
		Mother a = new A1();
		a.m1();
	}

}
