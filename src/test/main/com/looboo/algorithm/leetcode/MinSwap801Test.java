package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinSwap801Test {
    @Test
    public void test01() {
        assertEquals(1, new MinSwap801().minSwap(new int[]{1, 3, 5, 4}, new int[]{1, 2, 3, 7}));
    }

    @Test
    public void test02() {
        assertEquals(1, new MinSwap801().minSwap(new int[]{3, 3, 8, 9, 10}, new int[]{1, 7, 4, 6, 8}));
    }

    @Test
    public void test03() {
        assertEquals(1, new MinSwap801().minSwap(new int[]{0, 3, 5, 8, 9}, new int[]{2, 1, 4, 6, 9}));
    }
}