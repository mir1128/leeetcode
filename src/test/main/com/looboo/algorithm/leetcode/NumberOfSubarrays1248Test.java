package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfSubarrays1248Test {
    @Test
    public void test01() {
        int[] arr = {1, 1, 2, 1, 1};
        assertEquals(2, new NumberOfSubarrays1248().numberOfSubarrays(arr, 3));
    }

    @Test
    public void test02() {
        int[] arr = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        assertEquals(16, new NumberOfSubarrays1248().numberOfSubarrays(arr, 2));
    }

    @Test
    public void test03() {
        int[] arr = {2,4,6};
        assertEquals(0, new NumberOfSubarrays1248().numberOfSubarrays(arr, 1));
    }
}