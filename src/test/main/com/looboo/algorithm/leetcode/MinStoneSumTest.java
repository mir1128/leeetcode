package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStoneSumTest {
    @Test
    public void test01() {
        assertEquals(12, new MinStoneSum().minStoneSum(new int[]{5,4,9}, 2));
    }
}