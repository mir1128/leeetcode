package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortedSquares977Test {
    @Test
    public void test01() {
        int[] arr = {-4, -1, 0, 3, 10};
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, new SortedSquares977().sortedSquares(arr));
    }

    @Test
    public void test02() {
        int[] arr = {-7, -3, 2, 3, 11};
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, new SortedSquares977().sortedSquares(arr));
    }

    @Test
    public void test03() {
        int[] arr = {0, 2};
        assertArrayEquals(new int[]{0, 4}, new SortedSquares977().sortedSquares(arr));
    }
}