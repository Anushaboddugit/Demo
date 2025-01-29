package com.firstpackage;
@FunctionalInterface
interface A{
	public int add(int i,int j);
}
public class Lambda {

	public static void main(String[] args) {
		A obj=(i,j)->i+j;
         int result=obj.add(3,1);
         System.out.println(result);

	}

}
