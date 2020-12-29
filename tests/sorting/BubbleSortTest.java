package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sorting.BubbleSort;

class BubbleSortTest {
	
	BubbleSort bubbleSort = new BubbleSort();

	@Test
	void testSort() {
		int[] unsortedList = {20, 1, 17, 5, 9, 14, 7, 0};
		
		int[] expected = {0, 1, 5, 7, 9, 14, 17, 20};
		
		assertArrayEquals(expected, bubbleSort.sort(unsortedList));
	}
	
	@Test
	void testSortWithSwapFlag() {
		int[] unsortedList = {20, 1, 17, 5, 9, 14, 7, 0};
		
		int[] expected = {0, 1, 5, 7, 9, 14, 17, 20};
		
		assertArrayEquals(expected, bubbleSort.sortWithSwapFlag(unsortedList));
	}
}
