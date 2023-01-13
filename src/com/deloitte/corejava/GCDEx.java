package com.deloitte.corejava;

public class GCDEx {

	int getGCD(int num1, int num2) {
		int hcf = 1;
		int min = num1 < num2 ? num1 : num2;
		for (int i = min; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				hcf = i;
				break;
			}

		}

		return hcf;
	}

	public static void main(String[] args) {
		GCDEx g = new GCDEx();
		int gcd = g.getGCD(24, 3);
		System.out.println("GCD of two numbers is: "+gcd);
		// 12 - 1, 2, 3, 4, 6, 12
		// 24 - 1,2,3,4,6,8,12,24
	}

}
