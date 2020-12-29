package sorting;


/*
 * (1)Find the minimum value into  the list
 * (2)Swap it with the value in the current position
 * (3)Repeat this process for all the elements until the array is sorted 
 */
public class SelectionSort {
	
	public int[] sort(int[] array) {
		
		int i, j, min, temp;
		
		for(i = 0; i < array.length-1; i++) {
			min = i;
			for(j = i+1; j < array.length; j++) {
				if(array[j] < array[min]) 
					min = j;
			}
			
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		
		return array;
	}

	
	/*
	 * Time-complexity: O(n∧2)
	 * In-place sort(requires no addition storage space)
	 */
}
