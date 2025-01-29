package com.firstpackage;

public class Constructors {
	int num;
	String name;
	public Constructors() {
		System.out.println("normal constructors");
	}
	public Constructors(int num,String name) {
		this.num=num;
		this.name=name;
	}

	public static void main(String[] args) {
		Constructors obj=new Constructors();
		Constructors obj1=new Constructors(12,"priya");
		System.out.println(obj1.name+" "+obj1.num);

	}

}
