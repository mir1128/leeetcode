package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Rob2Test {

    @Test
    public void test01() {
        int[] arr = {2, 3, 2};
        assertEquals(3, new Rob2().rob(arr));
    }

    @Test
    public void test02() {
        int[] arr = {1, 2, 3, 1};
        assertEquals(4, new Rob2().rob(arr));
    }

    @Test
    public void test03() {
        int[] arr = {1, 3, 1, 3, 100};
        assertEquals(103, new Rob2().rob(arr));
    }

    @Test
    public void test04() {
        int[] arr = {4, 1, 2};
        assertEquals(4, new Rob2().rob(arr));
    }
}