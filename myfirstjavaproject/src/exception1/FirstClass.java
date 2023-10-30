package exception1;
import java.util.Scanner;
class UnsupportedOperationException extends RuntimeException {
	public  UnsupportedOperationException(String string) {
		super(string);	
	}
}
public class FirstClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter a number");
			double num1=sc.nextDouble();
			System.out.println("enter another number");
			double num2=sc.nextDouble();
				if(num2==0) {
					throw new UnsupportedOperationException("division by zero is not allowed");
				}
			double result=num1/num2;
			System.out.println(result);
			}
		catch(UnsupportedOperationException e) {
			System.out.println("ERROR: " +e);
		}
		finally {
			sc.close();
		}
	}
}

