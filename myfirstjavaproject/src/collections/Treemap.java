package collections;
import java.util.Map;
import java.util.TreeMap;
enum Gender{
	MALE,FEMALE;
}
class Contact{
private Long phoneNumber;
private String name;
private String email;
private Gender gender;

public Contact(Long phoneNumber, String name, String email,Gender gender) {
	this.phoneNumber = phoneNumber;
	this.name = name;
	this.email = email;
	this.gender=gender;
}
public String toString() {
	return "Contact [phoneNumber=" + phoneNumber + ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
}

}
public class Treemap {

	public static void main(String[] args) {
		TreeMap<Long,Contact> obj=new TreeMap<Long,Contact>();
		Contact c1=new Contact(9999667789L,"anusha","abc@123",Gender.FEMALE);
		Contact c2=new Contact(8989777772L,"swasti","absc@123",Gender.FEMALE);
		Contact c3=new Contact(7989777772L,"priya","abcd@123",Gender.FEMALE);
		Contact c4=new Contact(9989777772L,"rahul","abcd@123",Gender.MALE);
		obj.put(9999667789L,c1);
		obj.put(8989777772L,c2);
		obj.put(7989777772L,c3);
		obj.put(9989777772L,c4);
		for(Map.Entry<Long,Contact> e:obj.entrySet()) {
		System.out.println(e.getKey());
	}
		for(Map.Entry<Long,Contact> e:obj.entrySet()) {
			System.out.println(e.getValue());
		}
		for(Map.Entry<Long,Contact> e:obj.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}	
}
}


