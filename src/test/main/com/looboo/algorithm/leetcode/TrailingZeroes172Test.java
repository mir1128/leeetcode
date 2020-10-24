package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrailingZeroes172Test {

    @Test
    public void test01() {
        assertEquals(0, new TrailingZeroes172().trailingZeroes(3));
        assertEquals(1, new TrailingZeroes172().trailingZeroes(5));
        assertEquals(24, new TrailingZeroes172().trailingZeroes(100));
    }
}