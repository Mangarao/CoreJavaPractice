package com.deloitte.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
	
	
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter your name:");
		String input = br.readLine();
		System.out.println("Welcome, "+input);
		
	}

}
