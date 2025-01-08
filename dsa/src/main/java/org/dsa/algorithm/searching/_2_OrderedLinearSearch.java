package org.dsa.algorithm.searching;

public class _2_OrderedLinearSearch {

    // intArray must be ordered in asc order
    public int searchAsc(int[] intArrayAsc, int target) {
        for (int i = 0; i < intArrayAsc.length; i++) {
            if (intArrayAsc[i] == target) {
                return i;
            } else if (intArrayAsc[i] > target) {
                System.out.println("Looking at element: " + intArrayAsc[i]);
                return -1;
            }
        }
        return -1;
    }

    // intArray must be ordered in desc order
    public int searchDesc(int[] intArrayDesc, int target) {
        for (int i = 0; i < intArrayDesc.length; i++) {
            if (intArrayDesc[i] == target) {
                return i;
            } else if (intArrayDesc[i] < target) {
                System.out.println("Looking at element: " + intArrayDesc[i]);
                return -1;
            }
        }
        return -1;
    }

    // intArray can be ordered in any order
    public int searchGeneral(int[] intArray, int target) {
       boolean isAscending = intArray[0] <= intArray[intArray.length - 1];

       for (int i = 0; i < intArray.length; i++) {
         if (intArray[i] == target) {
             return i;
         } else if (isAscending && intArray[i] > target) {
             System.out.println("Looking at element: " + intArray[i]);
             return -1;
         } else if (!isAscending && intArray[i] < target) {
             System.out.println("Looking at element: " + intArray[i]);
             return -1;
         }
       }
       return -1;
    }

}
