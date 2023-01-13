package com.deloitte.corejava;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringSplitEx {
	
	static int sum(int...values) {
		int sum=0;
		for (int i : values) {
			sum+=i;
		}
		
		return sum;
	}
	//varargs
	public static void main(String... values) {
		int sum = sum(10,20,30,40,50);
		System.out.println(sum);
	}

}
