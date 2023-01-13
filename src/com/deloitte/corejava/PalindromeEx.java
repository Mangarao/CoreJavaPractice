package com.deloitte.corejava;

public class PalindromeEx {
	
	boolean isPalindrom(int num) {
		int temp =  num;
		int reverse = 0;
		while(num!=0) {
			reverse = reverse*10+ num%10;
			num=num/10;
		}
		System.out.println("Reverse of the number is: "+reverse);
		return temp==reverse?true:false;
	}
	
	boolean isPalindromApproach2(int num) {
		String str = String.valueOf(num);
		StringBuffer sb = new StringBuffer(str);
		return str.equals(sb.reverse().toString())?true:false;
		
		
	}

	public static void main(String[] args) {
		PalindromeEx p = new PalindromeEx();
		boolean palindrom = p.isPalindromApproach2(12321);
		System.out.println(palindrom);

	}

}
