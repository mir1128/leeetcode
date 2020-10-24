package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSizeSlices1388Test {

    @Test
    public void test01() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(10, new MaxSizeSlices1388().maxSizeSlices(arr));
    }

    @Test
    public void test02() {
        int[] arr = {8, 9, 8, 6, 1, 1};
        assertEquals(16, new MaxSizeSlices1388().maxSizeSlices(arr));
    }

    @Test
    public void test03() {
        int[] arr = {4, 1, 2, 5, 8, 3, 1, 9, 7};
        assertEquals(21, new MaxSizeSlices1388().maxSizeSlices(arr));
    }

    @Test
    public void test04() {
        int[] arr = {3, 1, 2};
        assertEquals(3, new MaxSizeSlices1388().maxSizeSlices(arr));
    }
}