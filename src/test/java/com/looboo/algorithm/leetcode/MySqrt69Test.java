package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MySqrt69Test {
    @Test
    public void test01() {
        assertEquals(46339, new MySqrt69().mySqrt(2147395599));
    }

    @Test
    public void test02() {
        assertEquals(46340, new MySqrt69().mySqrt(2147483647));
    }
}