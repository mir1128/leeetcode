package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfit714Test {
    @Test
    public void test01() {
        int[] arr = {1, 3, 2, 8, 4, 9};
        assertEquals(8, new MaxProfit714().maxProfit(arr, 2));
    }
}
