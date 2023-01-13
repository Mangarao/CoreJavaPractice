package com.deloitte.corejava;

public class StaticBlockEx {
	
	static class  A{
		
	}
	static String collegeName;
	int x;


	public StaticBlockEx() {
		x=10;
		System.out.println("Instance blcok:  "+x);
		System.out.println("Default constructor is executed");
	}
	
	
	

	static {
		collegeName="MIT";
		System.out.println("static block");
	}

	public static void main(String[] args) {
		System.out.println("Main method code is executed");
		new StaticBlockEx();
	}

}
