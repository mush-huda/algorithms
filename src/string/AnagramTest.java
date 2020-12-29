package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {
	
	private Anagram testClass;
	
	@BeforeEach
	void init() {
		testClass = new Anagram();
	}

	@Test
	void sameAfterSortedThenReturnTrue() {
		assertTrue(testClass.isAnagramUsingSorting("silent", "listen"));
	}
	
	
	@Test
	void histogramCountZeroThenReturnTrue() {
		assertTrue(testClass.isAnagramUsingCounting("silent", "listen"));
	}
	

}
