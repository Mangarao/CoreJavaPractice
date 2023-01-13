package com.deloitte.corejava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapEx {
	
	public static void main(String[] args) {
		Map<Integer,String> hm = new Hashtable<>();
		hm.put(101,"Manga");
		hm.put(102, "Rohit");
		hm.put(103, "Kohli");
		hm.put(103, "Rohit");
		
		System.out.println(hm);
		
		for (Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
