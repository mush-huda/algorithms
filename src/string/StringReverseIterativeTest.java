package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringReverseIterativeTest {
	
	private StringReverseIterative testClass;
	
	@BeforeEach
	void init() {
		testClass = new  StringReverseIterative();
	}
	

	@Test
	void test() {
		assertTrue(testClass.reverseString("hello").equalsIgnoreCase("olleh"));
		 
	}

}
