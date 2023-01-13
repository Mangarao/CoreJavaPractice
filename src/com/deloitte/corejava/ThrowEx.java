package com.deloitte.corejava;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class ThrowEx {
		boolean isEligibleForVote(int age) throws InvalidAgeException {
			if(age>=18) {
				return true;
			}else {
				throw new InvalidAgeException("InEligible for vote");
			}
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you age");
		int age = scanner.nextInt();
		ThrowEx t=new ThrowEx();
		try {
			boolean eligibleForVote = t.isEligibleForVote(age);
			System.out.println("eligible for vote: "+eligibleForVote);
		} catch (InvalidAgeException e) {
			System.err.println("you are ineligible for the vote.. please wait until you complete 18 years");
		}finally {
			System.out.println("Finally block code is executed");
		}

	}

}
