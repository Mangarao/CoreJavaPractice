package com.deloitte.corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
		    Student stud = (Student)	ois.readObject();
		    System.out.println(stud);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
