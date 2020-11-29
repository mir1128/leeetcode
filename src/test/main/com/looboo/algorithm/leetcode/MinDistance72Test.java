package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinDistance72Test {
    @Test
    public void test01() {
        assertEquals(3, new MinDistance72().minDistance("horse", "ros"));
    }

    @Test
    public void test02() {
        assertEquals(5, new MinDistance72().minDistance("intention", "execution"));
    }
}