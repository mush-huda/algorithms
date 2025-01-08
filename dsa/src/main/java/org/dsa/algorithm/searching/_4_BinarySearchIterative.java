package org.dsa.algorithm.searching;

public class _4_BinarySearchIterative {

    public int search(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] == target) {
                return mid;
            } else if (sortedArray[mid] < target) {
                // search on the right half
                low = mid + 1;
            } else if (sortedArray[mid] > target) {
                // search on the left half
                high = mid -1;
            }
        }

        return -1;
    }

}
