package com.deloitte.corejava;

public class MethodOverloadingEx {
	// you are passing ..
	//byte, short, int, long
	//byte-1 byte, short-2b, int-4byte, long-8bytes
	//1. By changing order of arguments
	double sum(int num1, float num2) {
		return num1+num2;
	}
	
	
	double sum(float num1, int num2) {
		return num1+num2;
	}
	
	

	public static void main(String[] args) {
		MethodOverloadingEx m=new MethodOverloadingEx();
		
		System.out.println(m.sum(20.04f,30));
	}
	
	public static void main() {
		
	}
	
	public static void main(Integer[] abc) {
		
	}

}
