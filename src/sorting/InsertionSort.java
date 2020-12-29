package sorting;

/*
 * 
 */
public class InsertionSort {
	
	public int[] sort(int[] array) {
		
		int i, j, v;
		
		for(i = 1; i <= array.length - 1; i++) {
			v = array[i];	// we are taking the value out because we will not swap this number. Instead we will push the array on the right side.
			j = i;
			
			while(array[j-1] > v && j >= 1) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = v;
		}
		
		return array;
	}
	

	
	/*
	 * Time complexity: 
	 * 			worst-case: O(n∧2), Let's say the array is sorted in descending order. The inner while loop has to move all the elements for ech element.  
	 * 			average case: O(n∧2)
	 * 			best-case: O(n), Let's say the array is sorted. The program will never enter into the while loop.
	 * 
	 * Efficient for small data nearly sorted data. That's why it is used as the recursive base case for 
	 * higher overhead divide-and-conquer sorting algorithms, such as merger sort or quick sort.
	 * 
	 * 
	 */
}
