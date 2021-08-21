package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyPow50Test {
    @Test
    public void test01() {
        assertEquals(1024, new MyPow50().myPow(2.0, 10), 0.000001);
    }
}