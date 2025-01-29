package com.firstpackage;
import java.util.Scanner;
public class HelloWorld {
	    	    public static void main(String[] args) {
	    	        Scanner scanner = new Scanner(System.in);

	    	        System.out.println("Enter the name");
	    	        String name = scanner.nextLine();

	    	        int numberOfRooms;
	    	        do {
	    	            System.out.println("Enter the number of rooms you needed");
	    	            numberOfRooms = scanner.nextInt();
	    	            if (numberOfRooms <= 0) {
	    	                System.out.println("Please enter a valid number");
	    	            }
	    	        } while (numberOfRooms <= 0);

	    	        System.out.println("Enter the phone number");
	    	        long phoneNumber = scanner.nextLong();

	    	        int totalAmount = numberOfRooms * 500; // Rs. 500 per room
	    	        System.out.println("Pay Rs. " + totalAmount + " for booking");
	    	        System.out.println("Your booking has been confirmed");
	    	    }
	    	}

	

