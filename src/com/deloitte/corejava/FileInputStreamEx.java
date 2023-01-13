package com.deloitte.corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	
	public static void main(String[] args) {
		//Read the data from the file - abc.txt
		
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("File doesn't exist");
		} catch (IOException e) {
			System.err.println("Technical error occurred during Input operation...");
		}
	}

}
