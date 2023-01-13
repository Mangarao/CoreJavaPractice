package com.deloitte.corejava;

public class PrimeEx {
	boolean isPrime(int num) {
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}
	
	//Write a program to print prime numbers from 1 to 100
	
    void printPrimes(int num) {
    	for (int i = 2; i <=num; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
    }
	
	public static void main(String[] args) {
		PrimeEx p = new PrimeEx();
		p.printPrimes(1000);
	}
}
