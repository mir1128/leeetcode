package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumIncompatibilityTest {
    @Test
    public void test01() {
        int[] arr = {1,2,1,4};
        assertEquals(4, new MinimumIncompatibility().minimumIncompatibility(arr, 2));
    }

    @Test
    public void test02() {
        int[] arr = {6,3,8,1,3,1,2,2};
        assertEquals(6, new MinimumIncompatibility().minimumIncompatibility(arr, 4));
    }

    @Test
    public void test03() {
        int[] arr = {5,3,3,6,3,3};
        assertEquals(-1, new MinimumIncompatibility().minimumIncompatibility(arr, 3));
    }
}