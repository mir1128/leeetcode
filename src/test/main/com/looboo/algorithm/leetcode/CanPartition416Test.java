package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanPartition416Test {

    @Test
    public void test01() {
        assertTrue(new CanPartition416().canPartition(new int[]{1, 5, 11, 5}));
    }

    @Test
    public void test02() {
        assertFalse(new CanPartition416().canPartition(new int[]{1, 2, 3, 5}));
    }

    @Test
    public void test03() {
        assertTrue(new CanPartition416().canPartition(new int[]{1, 1, 2, 2}));
    }
}