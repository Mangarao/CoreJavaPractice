package com.deloitte.corejava;

public class ForEachExample {

	public static void main(String[] args) {
		String names[] = { "Manga", "Dhoni", "Kohli", "Bhumra" };

		for (int i = 1; i <= 10; i++) {
			if (i == 5 || i==7) {
				continue; // skipping the current iteration
			}
			System.out.println(i);
		}

		System.out.println("Main method ends here");

	}

}
