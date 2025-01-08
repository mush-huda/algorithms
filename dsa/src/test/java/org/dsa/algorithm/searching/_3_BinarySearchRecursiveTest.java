package org.dsa.algorithm.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _3_BinarySearchRecursiveTest {

    _3_BinarySearchRecursive binarySearchRecursive = new _3_BinarySearchRecursive();

    @Test
    void testBinarySearch() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int res = binarySearchRecursive.search(sortedArray, 13);
        assertEquals(6, res);

        res = binarySearchRecursive.search(sortedArray, 12);
        assertEquals(-1, res);
    }

}