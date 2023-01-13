package com.deloitte.corejava;

public class Car implements Cloneable {
	//state
	int speed;
	
	//behavior
	void drive() {
		System.out.println("car is running with speed: "+speed);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		 
		new Car().drive();
		
		
		
	}

}
