package com.deloitte.corejava;

public class MyUserThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("My Thread is running...");
	}
	
	public static void main(String[] args) {
		MyUserThread m=new MyUserThread();
		m.start();
	}

}
