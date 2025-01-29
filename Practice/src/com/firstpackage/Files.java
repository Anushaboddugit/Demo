package com.firstpackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

	public static void main(String[] args) {
	File obj=new File("persons.txt");
	try {
		obj.createNewFile();
		FileWriter obj2= new FileWriter("persons.txt");
		obj2.write("this is a file");
		Scanner sc= new Scanner(obj);
		String a=sc.nextLine();
		System.out.println(a);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
