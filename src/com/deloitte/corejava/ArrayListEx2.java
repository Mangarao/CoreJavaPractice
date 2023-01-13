package com.deloitte.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
		LinkedList<String> al1=new LinkedList<>();
		al1.add("Manga");
		al1.add("Manga");
		
		al1.add("Kohli");
		al1.add("Dhoni");
		List<String> al2=new Vector();
		al2.add("Rohit");
		al2.add("Kohli");
		al2.add("Dinesh");
		
		Collections.sort(al1);
		
		//al1.retainAll(al2);
		System.out.println(al1);
		
		/*
		 * Enumeration<String> elements = al1.elements();
		 * while(elements.hasMoreElements()) {
		 * System.out.println(elements.nextElement()); }
		 */
		
		Iterator<String> iterator = al1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
