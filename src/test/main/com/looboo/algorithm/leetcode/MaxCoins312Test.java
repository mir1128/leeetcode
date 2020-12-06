package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxCoins312Test {
    @Test
    public void test01() {
        int[] arr = {3, 1, 5, 8};
        assertEquals(167, new MaxCoins312().maxCoins(arr));
    }

}