package com.deloitte.corejava;

public class TryMultiCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] myArray=new int[5];
			myArray[4]=12/2;
			return; //terminated program execution here itself
		}finally {
			System.out.println("Finally Block is executed");
		}

	}

}
