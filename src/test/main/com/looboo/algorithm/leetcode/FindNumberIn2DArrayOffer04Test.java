package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumberIn2DArrayOffer04Test {
    @Test
    public void test01() {
        int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        assertTrue(new FindNumberIn2DArrayOffer04().findNumberIn2DArray(arr, 5));
    }
}