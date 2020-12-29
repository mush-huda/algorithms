package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstNonRepeatingCharTest {

	private FirstNonRepeatingChar testClass;
	
	@BeforeEach
	void init() {
		testClass = new FirstNonRepeatingChar();
	}
	
	@Test
	void retunFirstNonRepeatingChar() {
		assertEquals('w', testClass.getFirstNonRepeatedChar("swiss"));
		assertEquals('l', testClass.getFirstNonRepeatedChar("dodol"));
	}

}
