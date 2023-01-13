package com.deloitte.corejava;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	private int id;
	private transient  String name;
	public static final String COLLEGE_NAME="MIT";
	

	public Student() {

	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "id: " + this.id + " name: " + this.name;
	}

	/*
	 * @Override public int compareTo(Student student) { return
	 * student.name.compareTo(this.name);
	 * 
	 * 
	 * if(this.id==student.id) { return 0; }else if(this.id<=student.id) { return
	 * +1; }
	 * 
	 * return -1;
	 * 
	 * }
	 */
}
