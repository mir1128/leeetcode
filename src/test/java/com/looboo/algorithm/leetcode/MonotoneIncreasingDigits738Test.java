package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonotoneIncreasingDigits738Test {
    @Test
    public void test01() {
        assertEquals(23399, new MonotoneIncreasingDigits738().monotoneIncreasingDigits(23410));
    }

    @Test
    public void test02() {
        assertEquals(299, new MonotoneIncreasingDigits738().monotoneIncreasingDigits(332));
    }
}