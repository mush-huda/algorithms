package org.dsa.algorithm.searching;

import static org.junit.jupiter.api.Assertions.*;

class _4_BinarySearchIterativeTest {

    _4_BinarySearchIterative binarySearchIterative = new _4_BinarySearchIterative();

    @org.junit.jupiter.api.Test
    void testBinarySearch() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int res = binarySearchIterative.search(sortedArray, 13);
        assertEquals(6, res);

        res = binarySearchIterative.search(sortedArray, 12);
        assertEquals(-1, res);
    }

}
