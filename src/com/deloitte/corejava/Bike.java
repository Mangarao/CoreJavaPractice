package com.deloitte.corejava;

abstract class Vehicle{
	
	final int speed;
	
	
	Vehicle(){
		speed=60;
		System.out.println("Super class constructor is invoked");
		
		
	}
	abstract void run();
}
public  class Bike extends Vehicle {
	
	
	public static void main(String[] args) {
		Vehicle b = new Bike(); //R.T Polymorphism
		b.run();

	}

	@Override
	void run() {
		System.out.println("Bike is running slowly..");
		
	}

}
