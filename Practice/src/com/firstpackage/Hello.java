package com.firstpackage;

import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructors, getters, and setters
    public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
    public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return (int) salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	

    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }

public class Hello {
    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee(101, "Alice", "HR", 50000));
        employees.add(new Employee(102, "Bob", "IT", 60000));
        // Add more employee objects...

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Run Application:");
            System.out.println("a) ID");
            System.out.println("b) Name");
            System.out.println("c) Department");
            System.out.println("d) Salary");
            System.out.println("e) Exit");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("e")) {
                break;
            }

            printSortedEmployees(employees, choice);
        }
    }

    private static void printSortedEmployees(Set<Employee> employees, String choice) {
        // Create a TreeSet for sorting based on the selected field
        Set<Employee> sortedEmployees = new TreeSet<>(employees);

        switch (choice) {
            case "a":
                // ID (already sorted by name)
                break;
            case "b":
                // Name (sorted by name by default)
                break;
            case "c":
                sortedEmployees = new TreeSet<>((e1, e2) -> e1.getDepartment().compareTo(e2.getDepartment()));
                break;
            case "d":
                sortedEmployees = new TreeSet<>((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Employee details sorted by " + choice + ":");
        for (Employee employee : sortedEmployees) {
            System.out.println(employee);
        }
    }
}
}
    
        

