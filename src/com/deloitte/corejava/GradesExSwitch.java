package com.deloitte.corejava;

public class GradesExSwitch {

	 void getGrade(char ch) {
		switch (ch) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
			System.out.println("Fail");
			break;

		default:
			System.out.println("Invalid grade");
			
		}

	}

	public static void main(String[] amr) {
		//Syntax for Object creation
		//classname refVariablename=new ClassName();
		GradesExSwitch g = new GradesExSwitch();
		g.getGrade('B');
		
	}

}
