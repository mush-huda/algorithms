package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringReverseStackTest {

	private StringReverseStack testClass;

	@BeforeEach
	void init() {
		testClass = new StringReverseStack();
	}

	@Test
	void test() {
		assertTrue(testClass.reverseUsingStack("hello").equalsIgnoreCase("olleh"));

	}

}
