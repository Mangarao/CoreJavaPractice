package com.deloitte.corejava;

class Bank{
	public int getRateOfInterest() {
		return 5;
	}
}

class SBI extends Bank{
	public int getRateOfInterest() {
		return 6;
	}
}

class ICICI extends Bank{
	public int getRateOfInterest() {
		return 7;
	}
}

class Axis extends Bank{
	public int getRateOfInterest() {
		return 8;
	}
}



public class TestBank {

	public static void main(String[] args) {
		Bank sbi=new SBI();
		System.out.println("SBI rate of interest is: "+sbi.getRateOfInterest());
		Bank icici=new ICICI();
		System.out.println("ICICI rate of interest is: "+icici.getRateOfInterest());
		Bank axis=new Axis();
		System.out.println("Axis rate of interest is: "+axis.getRateOfInterest());

	}

}
