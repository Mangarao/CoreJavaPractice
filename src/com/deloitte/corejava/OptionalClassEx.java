package com.deloitte.corejava;

import java.util.Optional;

public class OptionalClassEx {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[4] = "Manga";

		Optional<Object> empty = Optional.empty();
		System.out.println(empty.orElse("No value is present"));
		
		

	}

}
