package com.firstpackage;

class Container<T>{
	  public void demo( T elements[]){
		for(T value:elements) {
			System.out.println(value);
		}
	}
}
public class generics {

	public static void main(String[] args) {
	 Integer a[]= {1,2,3,4,4};
	 Container<Integer> obj=new Container<Integer>();
	 obj.demo(a);
	}

}
