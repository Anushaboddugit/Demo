package com.firstpackage;
class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class Objects {
	public static Person demo() {
		Person p=new Person("anu",22);
		return p;
	}
	public static void main(String[] args) {
		Person p1=demo();
		System.out.println(p1.name);
	}



}

