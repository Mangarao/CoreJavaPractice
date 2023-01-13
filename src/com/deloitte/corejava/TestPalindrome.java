package com.deloitte.corejava;

@FunctionalInterface
interface Father1{
	boolean test(String name);
	
	public default void sayHi() {
		System.out.println("Father says Hi");
	}
	
}

interface Mother1{
	boolean test(String name);
	
	
}
public class TestPalindrome implements Mother1, Father1 {

	public static void main(String[] args) {
		TestPalindrome testPalindrome = new TestPalindrome();
		testPalindrome.sayHi();
		
		/*
		 * Predicate<String> p = name -> new
		 * StringBuffer(name).reverse().toString().equals(name); boolean palindrome =
		 * p.test("MALAYALAM"); System.out.println(palindrome);
		 */

	}

	@Override
	public boolean test(String name) {
		// TODO Auto-generated method stub
		return false;
	}



	

}
