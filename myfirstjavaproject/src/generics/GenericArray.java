package generics;

import java.util.Arrays;

public class GenericArray {
	public static <T> void swapArray(T array[],int index1,int index2) {
		T temp=array[index1];
		array[index1]=array[index2];
	    array[index2]=temp;
	}

	public static void main(String[] args) {
		
	Integer intArray[]= {1,2,3,4,5};
    String  strArray[]= {"laptop","mouse","Keyboard"};
	 
	swapArray(intArray,1,2);
	System.out.println("array after swapping two elements"+Arrays.toString(intArray));
	swapArray(strArray,1,2);
	System.out.println("array after swapping two elements"+Arrays.toString(strArray));
	
	}

}
