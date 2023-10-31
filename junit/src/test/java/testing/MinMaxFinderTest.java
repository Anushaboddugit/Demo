package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
	MinMaxFinder obj;
	@BeforeEach
	void init() {
		obj= new MinMaxFinder();
	}
	@Test
	void test() {
		int[] inputArray= {56, 34, 7,3, 54, 3, 34, 34, 53} ;
		int[] minMax=obj.FindMinMax(inputArray);
		int[] expected= {3,56};
		assertArrayEquals(expected,minMax);
}		
		@Test
		@DisplayName("displaying array with negative values")
		void negativeTest() {
        int[] inputArray = {-5, -3, -9, -1, -7};
        int[] expected = {-9, -1};
        int[] result = obj.FindMinMax(inputArray);
        assertArrayEquals(expected, result);
	}
		@Test
		void emptyTest() {
		MinMaxFinder obj = new MinMaxFinder();
        int[] inputArray = {};
        int[] result = obj.FindMinMax(inputArray);
        assertArrayEquals(null, result);
	}
}

