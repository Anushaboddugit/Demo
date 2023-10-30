package collections;
import java.util.HashSet;
import java.util.Objects;
class Product{
	 int id;
	 String Name;
	 public Product(int id,String Name) {
		 this.id=id;
		 this.Name=Name;
	 }
	@Override
	public int hashCode() {
		return Objects.hash(Name, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(Name, other.Name) && id == other.id;
	}

	public String toString() {
		return "id:"+id+" "+"Name:"+Name;
		}
}

public class Hash {
	public static void main(String[] args) {
		HashSet<Product> obj= new HashSet<Product>();
		obj.add(new Product(1,"Laptop"));
		obj.add(new Product(2,"Desk"));
		obj.add(new Product(3,"mobile"));
		obj.add(new Product(4,"charger"));
		obj.add(new Product(5,"powerbank"));
		obj.add(new Product(6,"chair"));
		obj.add(new Product(7,"AC"));
		obj.add(new Product(8,"keyboard"));
		obj.add(new Product(9,"Mouse"));
		obj.add(new Product(10,"Speaker"));
	 
		obj.add(new Product(2,"Desk"));
		for(Product e:obj) {
			System.out.println(e);
		}
		
	}
	

}
