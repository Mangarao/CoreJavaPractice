package com.deloitte.corejava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetEx {
	
	public static void main(String[] args) {
		TreeSet<String> hashSet = new TreeSet<>();
		hashSet.add("Ravi");
		hashSet.add("Ravi");
		hashSet.add("Manga");
		hashSet.add("Mihiraan");
		hashSet.add("Aarohi");
		hashSet.add(null); 
		
		System.out.println(hashSet);
		
	}

}
