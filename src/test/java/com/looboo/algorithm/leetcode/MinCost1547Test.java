package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinCost1547Test {
    @Test
    public void test01() {
        assertEquals(16, new MinCost1547().minCost(7, new int[]{1, 3, 4, 5}));
    }

    @Test
    public void test02() {
        assertEquals(22, new MinCost1547().minCost(9, new int[]{5, 6, 1, 4, 2}));
    }
}