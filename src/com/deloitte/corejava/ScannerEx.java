package com.deloitte.corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("abc.txt");
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
	}

}
