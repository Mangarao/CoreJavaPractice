package com.deloitte.corejava;

public class RecursionEx {
	int i=1;
	void printNumber() {
		System.out.println(i+") "+"Hello World");
		++i;
		if(i!=11) {
		printNumber();  //Recursion - A method calls itself
		}
		
	}

	public static void main(String[] args) {
		RecursionEx r = new RecursionEx();
		r.printNumber();
	}

}
