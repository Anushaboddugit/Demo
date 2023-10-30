package stringAssignment;

public class Stringpool {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(str.toLowerCase());//lower case
	    System.out.println(str.toUpperCase());//upper case
	    System.out.println(str.replace('a','$'));//replace
	    System.out.println(str.contains("collection"));//contains
	    String str1="java string pool refers to collection of strings which are stored in heap memory";
	    System.out.println(str.equals(str1));
	    System.out.println(str.equalsIgnoreCase(str1));  
	}

}
