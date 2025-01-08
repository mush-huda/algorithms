package org.dsa.algorithm.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2_OrderedLinearSearchTest {

    _2_OrderedLinearSearch orderedLinearSearch = new _2_OrderedLinearSearch();

    @Test
    void orderedLinearSearchAsc() {
        int[] intArray = {4, 8, 12, 16, 20};
        int res = orderedLinearSearch.searchAsc(intArray, 12);
        assertEquals(2, res);

        res = orderedLinearSearch.searchAsc(intArray, 15);
        assertEquals(-1, res);
    }

    @Test
    void orderedLinearSearchDesc() {
        int[] intArray = {15, 12, 9, 6, 3};
        int res = orderedLinearSearch.searchDesc(intArray, 9);
        assertEquals(2, res);

        res = orderedLinearSearch.searchDesc(intArray, 8);
        assertEquals(-1, res);
    }

    @Test
    void orderedLinearSearchGeneral() {
        int[] intArrayAsc = {4, 8, 12, 16, 20};
        int res = orderedLinearSearch.searchAsc(intArrayAsc, 12);
        assertEquals(2, res);

        res = orderedLinearSearch.searchAsc(intArrayAsc, 15);
        assertEquals(-1, res);

        int[] intArrayDesc = {15, 12, 9, 6, 3};
        res = orderedLinearSearch.searchDesc(intArrayDesc, 9);
        assertEquals(2, res);

        res = orderedLinearSearch.searchDesc(intArrayDesc, 8);
        assertEquals(-1, res);
    }

}
