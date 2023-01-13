package com.deloitte.corejava;

class Employee{

	int salary=50000;
	void m1() {
		System.out.println("M1 method is executed");
	}
	
}

class Admin{
	
	void m1() {
		System.out.println("M1 method from Admin clas");
	}
	
}

public class Programmer extends Employee{
	int bonus=10000;
	


	public static void main(String[] args) {
		Programmer p=new Programmer();
		System.out.println("Net salary: "+(p.salary+p.bonus));
		p.m1();

	}

}
