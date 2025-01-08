package org.dsa.algorithm.searching;

public class _3_BinarySearchRecursive {

    public int search(int[] array, int target, int low, int high) {
        // base case
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2; // prevents overflow
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            // search on the right side
            return search(array, target, mid + 1, high);
        } else if (array[mid] > target) {
            //search on the left side
            return search(array, target, low, mid - 1);
        } else {
            return -1;
        }
    }

    public int search(int[] sortedArray, int target) {
        return search(sortedArray, target, 0, sortedArray.length - 1);
    }

}
