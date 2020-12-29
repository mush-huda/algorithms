package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeTest {
	
	Palindrome testClass;
	
	@BeforeEach
	void init() {
		testClass = new Palindrome();
	}

	@Test
	void whenPalindromeThenReturnTrue() {
		assertTrue(testClass.isPalindrome("wow"));
		assertTrue(testClass.isPalindrome("madam"));
	}
	
	@Test
	void whenNotPalindromeThenReturnFalse() {
		assertFalse(testClass.isPalindrome("dhaka"));
	}

}
