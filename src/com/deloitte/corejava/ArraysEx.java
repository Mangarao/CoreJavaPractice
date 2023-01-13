package com.deloitte.corejava;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		Integer[] nums= {10,30,20,50,40, null};
		for (int i : nums) {
			System.out.println(i);
		}
		
		System.out.println("After sorting");
		Arrays.sort(nums);
		for (Integer i : nums) {
			System.out.println(i);
		}
	}

}
