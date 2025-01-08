package org.dsa.algorithm.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1_UnorderedLinearSearchTest {

    _1_UnorderedLinearSearch unorderedLinearSearch = new _1_UnorderedLinearSearch();

    @Test
    void unorderedLinearSearch() {
        int[] intArray = {4, 8, 20, 12, 16};
        int res = unorderedLinearSearch.search(intArray, 12);
        assertEquals(3, res);
    }

    @Test
    void unorderedLinearSearch1() {
        String[] stringArray = {"RED", "GREEN", "WHITE", "BLACK", "YELLOW"};
        int res = unorderedLinearSearch.search(stringArray, "WHITE");
        assertEquals(2, res);
    }

}