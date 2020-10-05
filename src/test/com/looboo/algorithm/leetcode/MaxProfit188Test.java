package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfit188Test {
    @Test
    public void test01() {
        int[] arr = {2, 4, 1};
        assertEquals(2, new MaxProfit188().maxProfit(2, arr));
    }

    @Test
    public void test02() {
        int[] arr = {3, 2, 6, 5, 0, 3};
        assertEquals(7, new MaxProfit188().maxProfit(2, arr));
    }
}