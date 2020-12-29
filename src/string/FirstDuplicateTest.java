package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstDuplicateTest {

	FirstDuplicate testClass;
	
	@BeforeEach
	void init() {
		testClass = new FirstDuplicate();
	}
	
	@Test
	void test() {
		int[] a = {2, 3, 5, 4, 3, 2, 1};
		int actual = testClass.firstDuplicate(a);
		assertEquals(3, actual);
	}

}
