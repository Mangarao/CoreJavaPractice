package com.deloitte.corejava.pack1;



public class StringUtilities {
	public int data=10;
	
	public StringUtilities() {
		
	}
	public int getLength(String word) {
		return word.length();
	}
	
	public static void main(String[] args) {
		StringUtilities st=new StringUtilities();
		int x=st.data;
		st.getLength("Manga");
	}

}
