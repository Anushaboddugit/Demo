package collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.lang.Comparable;
class Employees implements Comparable<Employees> {
	private Integer id;
	private Integer salary;
	private String department;
	String name;
	public Employees(Integer id, String name, Integer salary, String department) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
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
		return salary;
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
	public int compareTo(Employees other) {
		  return this.name.compareTo(other.name);
	}
}

public class Treeset3 {

	public static void main(String[] args) {
		TreeSet<Employees> obj = new TreeSet<Employees>();	
		Employees e1= new Employees(101,"anu",50000,"development");
		Employees e2=new Employees(102,"priya",15000,"testing");
		Employees e3= new Employees(103,"akhila",25000,"hr");
		Employees e4=new Employees(104,"rahul",20000,"testing");
		obj.add(e1);
		obj.add(e2);
		obj.add(e3);
		obj.add(e4);
	System.out.println("enter and choose one ");
	System.out.println("a)id");
	System.out.println("b)name");
	System.out.println("c)salary");
	System.out.println("d)department");
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	char option=sc.next().charAt(0);
	switch(option){
	case 'a':
		{
		TreeSet<Employees> id1 = new TreeSet<>(Comparator.comparing(Employees::getId));
         id1.addAll(obj);
		   for(Employees e: id1){  
		     System.out.println(e);  
		   }
			break;
		}
	case 'b':{
		TreeSet<Employees> name1 = new TreeSet<>(Comparator.comparing(Employees::getName));
        name1.addAll(obj);
		 for(Employees e: name1){  
		System.out.println(e);
		}
		 
		break;
	}
	case 'c':{
		TreeSet<Employees> salary1 = new TreeSet<>(Comparator.comparing(Employees::getSalary));
        salary1.addAll(obj);
		for(Employees e:salary1){  
		System.out.println(e);
		}
		break;
	}
	case 'd':{
		TreeSet<Employees> department1 = new TreeSet<>(Comparator.comparing(Employees::getDepartment));
        department1.addAll(obj);
		for(Employees e: department1){  
		System.out.println(e);
		}
		break;
	}
	default:
		System.out.println("Invalid option");
	
	}
	}
}

