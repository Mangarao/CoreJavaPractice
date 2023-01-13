package com.deloitte.corejava.pack2;
import java.util.Date;

import com.deloitte.corejava.pack1.StringUtilities;

public class TestStringUtilities  {
	
	public static void main(String[] args) {
		StringUtilities str = new StringUtilities();
		int length = str.getLength("Manga Rao");
		System.out.println(length);
		
	}

}
