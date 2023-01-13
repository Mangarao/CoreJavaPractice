package com.deloitte.corejava;

public class LCM {

	int getLCM(int num1, int num2) {
		int max = (num1 > num2) ? num1 : num2;
		while (true) {
			if (max % num1 == 0 && max % num2 == 0) {
				return max;
			} else {
				max++;
			}
		}
	}

	public static void main(String[] args) {
		LCM lcm = new LCM();
		int lcmResult = lcm.getLCM(3, 8);
		System.out.println("LCM is" +lcmResult);
		
	}

}
