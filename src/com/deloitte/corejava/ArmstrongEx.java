package com.deloitte.corejava;
public class ArmstrongEx {
	boolean isArmStrong(int num) {
		int temp = num;
		int sum = 0;
		while (num != 0) {
			sum = sum + ((num % 10) * (num % 10) * (num % 10));
			num = num / 10;
		}
		//System.out.println("Final sum of the cubes of each digit is: " + sum);
		return sum == temp ? true : false;
	}

	void printArmstrongs(final int range) {
		
		for (int i = 1; i <= range; i++) {
			if(this.isArmStrong(i)) {
				System.out.print(i+" ");
			}
			
		}
	}
	
	public static void main(String[] args) {
		ArmstrongEx arm = new ArmstrongEx();
		arm.printArmstrongs(1000);

	}

}
