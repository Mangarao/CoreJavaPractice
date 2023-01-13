package com.deloitte.corejava;

public class ProgramCounter {
	
	static int count=0;
		public ProgramCounter() {
			++count;
			System.out.println(count);
			
		}
		
		int i;
		public static void sayHi() {
			ProgramCounter p=new ProgramCounter();
			System.out.println("Hi.."+p.i);
		}
	
	
	public static void main(String[] args) {
		System.out.println(Math.floor(10.20));
	}

}
