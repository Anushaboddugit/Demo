package annotataions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	int Sequence() default 0;
}
public class Sequence {
		@Execute(Sequence=2)
		public void method1() {
			System.out.println("method1");
		}
		@Execute(Sequence=1)
		public void method2() {
			System.out.println("method 2");
		}
		
		@Execute(Sequence=3)
			public void method3() {
				System.out.println("method 3");
			}	
		public static void main(String[] args) {
			Sequence obj=new Sequence();
			obj.method1();
			obj.method2();
			obj.method3();
		}
	}

