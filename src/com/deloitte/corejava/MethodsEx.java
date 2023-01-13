package com.deloitte.corejava;

public class MethodsEx {
	//Method with return type and with input parameter
	String m1(String name) { //parameter
		return "Hello,"+name;
	}
	
	//Main method without return type and with parameter
	public static void main(String[] args) {
		int a=10, b=20;
		String name="Manga";
		System.out.printf("a=%d, b=%d",a,b);
		System.out.printf("\nHello, %s",name);
		
		
		

	}

}
