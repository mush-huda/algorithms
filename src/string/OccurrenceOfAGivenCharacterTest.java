package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OccurrenceOfAGivenCharacterTest {

	private OccurrenceOfAGivenCharacter testClass;
		
	@BeforeEach
	void init() {
		testClass = new OccurrenceOfAGivenCharacter();
	}
	
	@Test
	void returnsTheCharCount() {
		assertEquals(2, testClass.countOccurrence("Queue", 'e'));
		assertEquals(3, testClass.countOccurrence("Lollipop", 'l'));
	}
	
	@Test
	void retunsTheCharCountUsingStream() {
		assertEquals(2L, testClass.countUsingStream("Queue", 'e'));
		assertEquals(3L, testClass.countOccurrence("Lollipop", 'l'));
	}

}
