package java11;
@FunctionalInterface
interface SimpleInterest {
    double calculate(double principal, double rate, double time);
}
public class SI {

	    public static void main(String[] args) {
	    	double principal = 1000.0;
	    	double rate = 5.0;
	    	double time = 2.0;
	       
	    	SimpleInterest obj = (p,r,t) -> (p * r * t) / 100.0;
	    
	        double simpleInterest1 = obj.calculate(principal, rate, time);
	        System.out.println("Simple Interest: " + simpleInterest1);
	    }
	   
	}

