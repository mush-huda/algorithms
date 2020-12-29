package searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.searching.UnorderedLinearSearch;

class UnorderedLinearSearchTest {
	
	UnorderedLinearSearch search = new UnorderedLinearSearch();

	@Test
	void returnIndexWhenDataFound() {
		int[] arrayOfInt = {4, 8, 12, 16 ,20};
		int actual = search.unOrderedLinearSearch(arrayOfInt, 12);
		assertEquals(2, actual);
	}
	
	@Test
	void returnNegativeOneWhenDataNotFound() {
		int[] arrayOfInt = {4, 8, 12, 16 ,20};
		int actual = search.unOrderedLinearSearch(arrayOfInt, 24);
		assertEquals(-1, actual);
	}

}
