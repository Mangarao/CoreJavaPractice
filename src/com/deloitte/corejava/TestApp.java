package com.deloitte.corejava;

import java.util.Optional;

public class TestApp {
	
	public static void main(String[] args) {
		String[] names = new String[5];
		names[2] = "Java optional class practice";

		Optional<Object> empty = Optional.ofNullable(names[3]);
		System.out.println(empty.orElse("bla"));
		//System.out.println(empty);
	}

}
