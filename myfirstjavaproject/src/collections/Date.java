package collections;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.ListIterator;

public class Date {

	public static void main(String[] args) {
		        LinkedList<LocalDate> dateOfBirths = new LinkedList<>();
		 
		        dateOfBirths.add(LocalDate.of(2000, 12, 23));
		        dateOfBirths.add(LocalDate.of(2001, 12, 23));
		        
		        ListIterator<LocalDate> iterator = dateOfBirths.listIterator(dateOfBirths.size());

		        while (iterator.hasPrevious()) {
		            LocalDate dob = iterator.previous();
		            boolean isLeapYear = dob.isLeapYear();
		            if(isLeapYear) {
		            	System.out.println("Your date of birth is " + dob.toString() + " and it was a leap year");
		            }
		            else {
		            	System.out.println("Your date of birth is " + dob.toString() + " and it was not aleap year");
		            }
		        }
		    }
		}
