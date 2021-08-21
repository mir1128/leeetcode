package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumSubmatrix363Test {

    @Test
    public void test01() {
        int[][] arr = {{1, 0, 1}, {0, -2, 3}};
        assertEquals(2, new MaxSumSubmatrix363().maxSumSubmatrix(arr, 2));
    }

    @Test
    public void test02() {
        int[][] arr = {
                {5, -4, -3, 4},
                {-3, -4, 4, 5},
                {5, 1, 5, -4}
        };
        assertEquals(-2, new MaxSumSubmatrix363().maxSumSubmatrix(arr, -2));
    }

    @Test
    public void test03() {
        int[][] arr = {{2, 2, -1}};
        assertEquals(-1, new MaxSumSubmatrix363().maxSumSubmatrix(arr, 0));
    }

    @Test
    public void test04() {
        int[][] arr = {{5, -4, -3, 4}, {-3, -4, 4, 5}, {5, 1, 5, -4}};
        assertEquals(8, new MaxSumSubmatrix363().maxSumSubmatrix(arr, 8));
    }
}
