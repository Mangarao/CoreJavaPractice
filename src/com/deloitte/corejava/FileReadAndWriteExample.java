package com.deloitte.corejava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWriteExample {
	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\marepalli\\Desktop\\P9A\\Running Notes.txt";
		
		File file = new File(filePath);
		System.out.println(file.getAbsolutePath());
		
		FileReader fr=null;
		FileWriter fw=null;
		
		try {
			 fr = new FileReader(file);
			fw = new FileWriter("C:\\Users\\marepalli\\Desktop\\P9A\\Runningcopy.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			/*
			 * int i=0; while((i=fr.read())!=-1) { fw.write(i); }
			 */
			
			fw.flush();
			System.out.println("File is copied successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fr.close();
			fw.close();
		}
		
	}

}
