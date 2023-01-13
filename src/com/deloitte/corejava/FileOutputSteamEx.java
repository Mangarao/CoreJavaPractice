package com.deloitte.corejava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileOutputSteamEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileOutputStream fos = new FileOutputStream("abc.txt", true);
		PrintStream ps= new PrintStream(fos);
		ps.println("Hello, This is manga");
		ps.println("Java Fullstack faculty");
		fos.close();
		System.out.println("File Output operation is successful");
		
		
		
		
	}

}
