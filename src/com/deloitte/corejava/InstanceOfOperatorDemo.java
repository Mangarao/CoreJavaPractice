package com.deloitte.corejava;

public class InstanceOfOperatorDemo {
	void m() {
		 InstanceOfOperatorDemo instanceOfOperatorDemo = new InstanceOfOperatorDemo();
	}

	public static void main(String[] args) {
		String name="Manga Rao";
		System.out.println(name instanceof String);
		name=null;
		System.out.println(name instanceof Object);
		String[] names = {"Manga","Dhoni","Kohli","Sania"};
		System.out.println(names instanceof Object[]);
		

	}

}
