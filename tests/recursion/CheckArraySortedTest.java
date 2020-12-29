package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import recursion.CheckArraySorted;

class CheckArraySortedTest {

	private CheckArraySorted checkArraySorted = new CheckArraySorted();

	@Test
	@DisplayName("sorted array should return true")
	void returnTrueIfArrayIsSorted() {
		int[] array = {10, 15, 25, 30, 40};
		int length = array.length;
		assertTrue(checkArraySorted.isArrayInSortedOrder(array, length));
	}
	
	@Test
	@DisplayName("unsorted array should return false")
	void returnFalseIfArrayIsUnsorted() {
		int[] array = {10, 15, 5, 20, 10};
		int length = array.length;
		assertFalse(checkArraySorted.isArrayInSortedOrder(array, length));
	}
}
