package exception1;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter a number");
			double num1=sc.nextDouble();
			System.out.println("enter another number");
			double num2=sc.nextDouble();
				if(num2==0) {
					throw new ArithmeticException("division by zero is not allowed");
				}
			double result=num1/num2;
			System.out.println(result);
			}
			catch(ArithmeticException e) {
				System.out.println("Error :division by zero is not allowed"); 
			}
			finally {
				sc.close();
			}
	}
}

