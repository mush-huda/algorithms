package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import recursion.Factorial;

class FactorialTest {

	private Factorial factorial = new Factorial();
	
	@Test
	void testIterativeFactorial() {
		assertEquals(120, factorial.iterativeFactorial(5));
	}
	
	@Test
	void testRecursiveFactorial() {
		assertEquals(24, factorial.recursiveFactorial(4));
	}
	
	@Test
	void testRecursiveFactorialOfZeroShouldRetunOne() {
		assertEquals(1, factorial.recursiveFactorial(0));
		
	}

}
