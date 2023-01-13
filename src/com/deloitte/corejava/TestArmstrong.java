package com.deloitte.corejava;

public class TestArmstrong {

	public static void main(String[] args) {
		
		ArmstrongEx a= new ArmstrongEx();
		a.printArmstrongs(1000);
		
		PalindromeEx p=new PalindromeEx();
		boolean palindrom = p.isPalindrom(12321);
		System.out.println(palindrom);

	}

}
