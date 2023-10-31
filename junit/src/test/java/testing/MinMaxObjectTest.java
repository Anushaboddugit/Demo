package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxObjectTest {

	@Test
	@DisplayName("To check min and max of an array")
	void test() {
		
		int[] arr= {56,34,7,3,54,3,34,34,53};
		MinMaxObject result = MinMaxObject.FindMinMax(arr);
	    assertEquals(3, result.getMin());
	    assertEquals(56, result.getMax());
}
		@DisplayName("To check min and max of a negative array")
		@Test
		void negativetest() {
		
		int[] arr= {-56,-34,-7,-3,-54,-3,-34,-34,-53};
		MinMaxObject result = MinMaxObject.FindMinMax(arr);
	    assertEquals(-56, result.getMin(),"array should return negative min value");
	    assertEquals(-3, result.getMax());
}
		@Test
		@DisplayName("array that has no values")
		void Testarray() {
			int arr[]= {0};
			MinMaxObject result=MinMaxObject.FindMinMax(arr);
			assertEquals(null,result,"The array should return null");
		}
		
}