package com.deloitte.corejava;

import java.io.IOException;

class Animal{
	protected void eat() throws RuntimeException{
		System.out.println("animals eat  something...");
	}
}
public class Tiger extends Animal {
	
	@Override
	public void eat() {
		System.out.println("Tiger is eating Non-veg...");
	}
	
	public static void main(String[] args) {
		Animal a = new Tiger();
		a.eat();
	}

}
