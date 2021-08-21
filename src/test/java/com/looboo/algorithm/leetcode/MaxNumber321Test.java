package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxNumber321Test {

    @Test
    public void test01() {
        int[] nums1 = {3, 4, 6, 5};
        int[] nums2 = {9, 1, 2, 5, 8, 3};
        assertArrayEquals(new int[]{9, 8, 6, 5, 3}, new MaxNumber321().maxNumber(nums1, nums2, 5));
    }
}