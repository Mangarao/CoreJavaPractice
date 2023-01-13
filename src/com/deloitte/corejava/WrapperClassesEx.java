package com.deloitte.corejava;

public class WrapperClassesEx {
	
	public static void main(String[] args) {
		int a=10;
		Integer i=a; //auto boxing
		i=Integer.valueOf(i); //Manual conversion
		
		double d=10.0;
		Double d1 = Double.valueOf(d);
		
		
		Integer id=101;
		int stuId = id; //auto unboxing
		stuId = id.intValue();
		Float f=10.04f;
		
		float fractionVal = f.floatValue(); //Manual conversion
		fractionVal = f; // auto unboxing
		
		System.out.println(Integer.min(100, 20));
		
		
		
	}

}
