package com.deloitte.corejava;

import java.util.Scanner;

public class ConditionalExDemo {

	static int getBiggerNo(int num1, int num2, int num3) {
		
		/*
		 * if (num1 > num2 && num1 > num3) { return num1; } else if (num2 > num3) {
		 * return num2; } else { return num3; }
		 */
		
		return (num1 > num2 && num1 > num3)?num1:(((num2>num3)?num2:num3));

	}
	
	static int getSmaller(int num1, int num2, int num3) {

		/*
		 * if (num1 < num2 && num1 < num3) { return num1; } else if (num2 < num3) {
		 * return num2; } else { return num3; }
		 */
		return (num1 < num2 && num1 < num3)?num1:(((num2<num3)?num2:num3));

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = scanner.nextInt();
		System.out.println("Enter number2");
		int num2 = scanner.nextInt();
		System.out.println("Enter number3");
		int num3 = scanner.nextInt();
		int biggerNo = getBiggerNo(num1, num2, num3);
		System.out.println("The bigger number among given 3 numbers is: " + biggerNo);
		int smaller = getSmaller(num1, num2, num3);
		System.out.println("The smaller number among given 3 numbers is: " + smaller);

	}

}
