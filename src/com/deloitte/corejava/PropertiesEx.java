package com.deloitte.corejava;

import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;

public class PropertiesEx {
	
	public static void main(String[] args)  {
		
		try {
			FileReader fileReader = new FileReader("db.properties");
			Properties p=new Properties();
			p.load(fileReader);
			System.out.println("username: "+p.getProperty("username"));
			System.out.println("password: "+p.getProperty("password"));
			System.out.println("dbname: "+p.getProperty("dbname"));
		} catch (FileNotFoundException e) {
			System.err.println("File not found, please mention the right file");
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * Properties p =new Properties(); p.setProperty("dbUserName", "manga");
		 * p.setProperty("driver", "jdbc:odbc:oracle:OracleDriver"); p.store(new
		 * FileWriter("db.properties"), "Properties example");
		 * 
		 * System.out.println("Program execution ends");
		 */
		/*
		 * Properties prop = System.getProperties();
		 * 
		 * for (Entry<Object, Object> entry : prop.entrySet()) {
		 * System.out.println(entry.getKey()+" =  "+entry.getValue());
		 * 
		 * }
		 */
	}

}
