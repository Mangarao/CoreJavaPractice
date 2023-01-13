package com.deloitte.corejava;

import java.util.Scanner;

/**
 * 
 * @author marepalli
 * @Date - 1/9/2023
 * This is the class which contains to perform Basic Arithemetic operations
 * @since 1.0
 *
 */

class Calculator {

	// Method to return sum of two given numbers
	static int sum(int num1, int num2) {
		return num1 + num2;

	}

	/*
	 * This is the comment1
	 * This is the comment2
	 */
	static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	/**
	 * This method takes two input parameters, returns multiplication of them
	 * @param num1
	 * @param num2
	 * @return int type
	 */
	static int multiplication(int num1, int num2) {
		return num1*num2;
	}
	
	/**
	 * This method takes two input parameters, returns division of them
	 * @param num1
	 * @param num2
	 * @return int type
	 */
	static int division(int num1, int num2) {
		return num1/num2;
	}
	
	/**
	 * This method takes two input parameters, returns modulus of them
	 * @param num1
	 * @param num2
	 * @return int type
	 */
	static int modulus(int num1, int num2) {
		return num1%num2;
	}

	// Method for ,division, multiplication and Modulus

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number1 ");
		int num1 = scanner.nextInt();
		System.out.println("Enter number2 ");
		int num2 = scanner.nextInt();
		
		int sum = sum(num1,num2);
		System.out.println("sum is: " + sum);
		int subtract = subtract(num1, num2);
		System.out.println("Subtraction  is: " + subtract);
		int mul = multiplication(num1,num2);
		System.out.println("Multiplication is: "+mul);
		int div = division(num1,num2);
		System.out.println("division is: "+div);
		int mod = modulus(num1, num2);
		System.out.println("modulus is: "+mod);
		

	}
}
