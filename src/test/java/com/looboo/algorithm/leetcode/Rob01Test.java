package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Rob01Test {
    @Test
    public void test01() {
        int[] arr = {1, 2, 3, 1};
        assertEquals(4, new Rob01().rob(arr));
    }

    @Test
    public void test02() {
        int[] arr = {2, 7, 9, 3, 1};
        assertEquals(12, new Rob01().rob(arr));
    }

    @Test
    public void test03() {
        int[] arr = {1, 2, 3, 1};
        assertEquals(4, new Rob01().rob1(arr));
    }

    @Test
    public void test04() {
        int[] arr = {2, 7, 9, 3, 1};
        assertEquals(12, new Rob01().rob1(arr));
    }
}