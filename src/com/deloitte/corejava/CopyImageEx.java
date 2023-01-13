package com.deloitte.corejava;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageEx {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("javalogo.png");
			FileOutputStream fos = new FileOutputStream("javalogo_copy.jpg");
			
			
			int i = 0;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			System.out.println("Duplicate image is created successfully");

		} catch (FileNotFoundException e) {
			System.err.println("File doens't exist");
		} catch (IOException e) {
			System.err.println("Technical error during IO operation");
		}
	}

}
