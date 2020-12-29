package sorting;

/*
 * (1)Iterate the input array from the first element to the last, comparing each
 * pair of elements and swapping them if needed. 
 * (2)After the first iteration, the highest number will be on the right. So from
 * next iterations, we don't need to check till the end
 */
public class BubbleSort {

	public int[] sort(int[] array) {

		for (int pass = array.length - 1; pass >= 0; pass--) {
			for (int i = 0; i <= pass - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		return array;
	}

	/*
	 * Algorithm takes O(n∧2) (even in best case because it enters in the inner loop
	 * and compares all the elements). We can improve the time complexity of the 
	 * best case by introducing a 'swapped' flag.
	 */
	
	public int[] sortWithSwapFlag(int[] array) {

		int swapped = 1;
		
		for (int pass = array.length - 1; pass >= 0 && swapped == 1; pass--) {
			swapped = 0;
			for (int i = 0; i <= pass - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = 1;
				}
			}
		}
		return array;
	}
	
	
	/*
	 * This modified version improves the best case of bubble sort to O(n)
	 * 
	 * The only significant advantage that bubble sort has over other implementations 
	 * is that it can detect whether the input list is already sorted or not.
	 */
	
}
