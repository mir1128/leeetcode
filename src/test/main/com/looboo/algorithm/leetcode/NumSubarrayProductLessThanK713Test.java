package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumSubarrayProductLessThanK713Test {
    @Test
    public void test01() {
        assertEquals(8, new NumSubarrayProductLessThanK713().numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }

    @Test
    public void test02() {
        int[] arr = {10, 9, 10, 4, 3, 8, 3, 3, 6, 2, 10, 10, 9, 3};
        assertEquals(18, new NumSubarrayProductLessThanK713().numSubarrayProductLessThanK(arr, 19));
    }
}