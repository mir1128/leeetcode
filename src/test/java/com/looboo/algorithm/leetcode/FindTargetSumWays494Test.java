package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTargetSumWays494Test {

    @Test
    public void test01() {
        int[] arr = {1, 1, 1, 1, 1, 1};
        assertEquals(0, new FindTargetSumWays494().findTargetSumWays(arr, 3));
    }

    @Test
    public void test02() {
        int[] arr = {1, 0};
        assertEquals(2, new FindTargetSumWays494().findTargetSumWays(arr, 1));
    }

    @Test
    public void test03() {
        int[] arr = {35, 34, 21, 14, 46, 49, 36, 7, 17, 39, 41, 12, 38, 18, 8, 31, 10, 22, 39, 11};
        assertEquals(6056, new FindTargetSumWays494().findTargetSumWays(arr, 26));
    }
}