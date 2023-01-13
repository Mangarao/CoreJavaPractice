package com.deloitte.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListEx {
	public static void main(String[] args) {
		// ArrayList with Generics
		Student s1 = new Student(101, "Manga");
		Student s3 = new Student(103, "Kohli");
		Student s2 = new Student(102, "Dhoni");
		ArrayList<Student> al = new ArrayList();
		al.add(s1);
		al.add(s3);
		al.add(s2);
		Collections.sort(al, new NameComparator());
		System.out.println("Iterate elements using ListIterator");
		ListIterator<Student> li = al.listIterator();
		
		System.out.println("Print elements in forward direction");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		/*
		 * System.out.println("Print elements in backward direction");
		 * while(li.hasPrevious()) { System.out.println(li.previous()); }
		 * 
		 * System.out.println("size: " + al.size());
		 */
		// iterate Arraylist using Iterator
		/*
		 * Iterator iterator = al.iterator();
		 * System.out.println("Iteration using the iterator"); while(iterator.hasNext())
		 * { System.out.println(iterator.next()); }
		 */

		// iterate Arraylist using Foreach

		/*
		 * System.out.println("Iteration using For each"); for (Student student : al) {
		 * System.out.println(student); }
		 */

	}

}
