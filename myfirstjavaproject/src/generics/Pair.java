package generics;
import java.util.Date;
public class Pair<K,V> {
	private K key;
	private V value;
	public void setKey(K key) {
		if(key instanceof String) {
			this.key=key;
		}
		else {
			throw new IllegalArgumentException("Key must be a String.");
		}
		}
	   public void setValue(V value) {
		   if (value instanceof String || (value instanceof Date && key instanceof String)) {
	            this.value = value;
	   }
	    else {
			throw new IllegalArgumentException("Key must be a String.");
			}
	   }
	   public K getkey() {
		   return key;
	   }
	   public V getValue() {
		   return value;
	   }
	public static void main(String[] args) {
		Pair<String,String> obj= new Pair<>();
		obj.setKey("1");
		obj.setValue("Hello");
        System.out.println("Key: " + obj.getkey());
        System.out.println("Value: " + obj.getValue());
        Pair<String,Date> myObj=new Pair<String,Date>();
        myObj.setKey("Today is");
        myObj.setValue(new java.util.Date());
        System.out.println("Key: " + myObj.getkey());
        System.out.println("Value: " +myObj.getValue());
	}

}
