package com.deloitte.corejava;

public class PrintTable {

	void printTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}
	}

	public static void main(String[] args) {
		PrintTable p = new PrintTable();
		p.printTable(9);
		System.out.println("****");
		p.printTable(5);
	}

}
