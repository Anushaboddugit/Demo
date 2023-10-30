package annotataions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
  String testCase() default"It is a test case";
}
public class Test1 {
	@Test(testCase = "its a testCase method")
	  public void testCase() {
		
	  }
    //since it is static method we shouldn't use the @Test annotation here
    public static void testMethod1() {
    	
    }
    public static void main(String[] args) {
       
}
    }
