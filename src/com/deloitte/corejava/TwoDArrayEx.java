package com.deloitte.corejava;

import java.util.Iterator;

public class TwoDArrayEx {
	
	public static void main(String[] args) {
		int[][] nums = {{1,2},{4,5},{7,8}};
			
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[1].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}

}
