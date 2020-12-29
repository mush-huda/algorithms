package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsOnlyDigitsTest {

	ContainsOnlyDigits testClass;
	
	@BeforeEach
	void init() {
		testClass = new ContainsOnlyDigits();
	}
	
	@Test
	void whenOnlyNumericDigitsThenReturnTrue() {
		assertTrue(testClass.containsOnlyDigits("1234"));
	}
	
	@Test
	void whenNonDigitsThenReturnFalse() {
		assertFalse(testClass.containsOnlyDigits("12b34"));
		assertFalse(testClass.containsOnlyDigits("!Ö,$"));
		assertFalse(testClass.containsOnlyDigits("arf"));
	}
	
}
