package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstUnitTestTest {
	@BeforeAll
		static void run() {
		System.out.println("this has to execute before all");
		}
	@AfterAll
	static void run1() {
		System.out.println("closing all the resourses");
	}
	FirstUnitTest obj;
	@BeforeEach
	void init(){
		obj=new FirstUnitTest();
	}
	@AfterEach
	void init1(){
		System.out.println("cleaning up");
	}
@Test
@DisplayName("add method to add two numbers")
void Testadd() {
//	FirstUnitTest obj=new FirstUnitTest();
	int expected=2;
	int actual=obj.add(1, 1);
	assertEquals(expected,actual,"adding of two numbers");
}

@Test
@DisplayName("multiply two numbers")
void testmultiply() {
//	FirstUnitTest obj=new FirstUnitTest();
	assertEquals(4,obj.multiply(2,2),"multiplying two numbers");
}
@Test
@DisplayName("divide two numbers")
void TestDiv() {
//	FirstUnitTest obj=new FirstUnitTest();
	assertThrows(ArithmeticException.class,()->obj.div(2,0));
	assertEquals(2,obj.div(4,2),"diving two two numbers");
}

}