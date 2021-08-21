package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountBits338Test {
    @Test
    public void test01() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, new CountBits338().countBits(5));
    }
}