package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinOperations5602Test {

    @Test
    public void test01() {
        assertEquals(5, new MinOperations5602().minOperations(new int[]{3, 2, 20, 1, 1, 3}, 10));
    }

    @Test
    public void test02() {
        assertEquals(-1, new MinOperations5602().minOperations(new int[]{1, 1}, 3));
    }
}