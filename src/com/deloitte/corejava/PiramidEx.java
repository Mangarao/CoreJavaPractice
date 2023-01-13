package com.deloitte.corejava;

import java.util.Iterator;

public class PiramidEx {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) { //outer for loop
			for (int j = 5; j >=i; j--) { //inner for loop
				System.out.print(j+" ");
			} //inner for loop ends here
			System.out.println();
		} //outer for loop ends here
	}

}
