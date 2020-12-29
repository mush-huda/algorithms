package recursion;

/*
 * Given an array, check whether the array is sorted in ascending order (with recursion).
 */

/*
 * Step 1: If the length of the array is 0 or 1, then return true
 * Step 2: Check the last two elements of array, if are sorted then perform recursive
 * 		   call with length-1. Otherwise return false.
 * Termination: If all the elements are sorted the length will eventually become 1 and terminate. 
 */
public class CheckArraySorted {
	public boolean isArrayInSortedOrder(int[] array, int length) {
		if(length == 1 || length == 0)
			return true;
		return  array[length-1] < array[length-2] ? false : isArrayInSortedOrder(array, length-1);
	}
}



//Time Complexity: O(n)
//Auxiliary Space: O(n) for Recursion Call Stack