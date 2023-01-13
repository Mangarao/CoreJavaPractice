package com.deloitte.corejava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerailizationEx {
	public static void main(String[] args) {
		Student s = new Student(101,"Manga");
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
			oos.writeObject(s);
			oos.close();
			System.out.println("Serialization is done... ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
