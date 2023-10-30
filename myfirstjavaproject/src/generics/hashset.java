package generics;

import java.util.HashSet;

class Employee{
	private Integer id;
	String name;
	private Integer salary;
	private String department;
	
	public Employee(Integer id, String name, Integer salary, String department) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
}

public class hashset {
	public static void main(String[] args) {
		HashSet<Employee> obj=new HashSet<Employee>();
		obj.add(new Employee(101,"anu",50000,"developer"));
		obj.add(new Employee(102,"anu",50000,"developer"));
		obj.add(new Employee(103,"anuh",50000,"developer"));
	for(Employee val:obj) {
		System.out.println(val);
	}
	}
}
