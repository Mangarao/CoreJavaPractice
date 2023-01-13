package com.deloitte.corejava;

public class StringBufferEx {

	public boolean isPalindrome(String name) {
		StringBuilder sb = new StringBuilder(name);
		return sb.reverse().toString().equals(name);
	}

	public static void main(String[] args) {
		// Ex: stringbuffer is mutable
		StringBufferEx sb = new StringBufferEx();
		boolean palindrome = sb.isPalindrome("MADAM");
		System.out.println(palindrome);

		/*
		 * sb.append(" arepalli"); System.out.println(sb);
		 */
	}

}
