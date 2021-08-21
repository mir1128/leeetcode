package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSum1186Test {
    @Test
    public void test01() {
        int[] arr = {1, -2, 0, 3};
        assertEquals(4, new MaximumSum1186().maximumSum(arr));
    }

    @Test
    public void test02() {
        int[] arr = {1, -2, -2, 3};
        assertEquals(3, new MaximumSum1186().maximumSum(arr));
    }

    @Test
    public void test03() {
        int[] arr = {-1, -1, -1, -1};
        assertEquals(-1, new MaximumSum1186().maximumSum(arr));
    }
}