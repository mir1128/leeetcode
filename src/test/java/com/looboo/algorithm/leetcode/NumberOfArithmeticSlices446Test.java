package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfArithmeticSlices446Test {

    @Test
    public void test01() {
        int[] arr = {2, 4, 6, 8, 10};
        assertEquals(7, new NumberOfArithmeticSlices446().numberOfArithmeticSlices(arr));
    }

    @Test
    public void test02() {
        int[] arr = {2, 2, 3, 4};
        assertEquals(2, new NumberOfArithmeticSlices446().numberOfArithmeticSlices(arr));
    }

    @Test
    public void test03() {
        int[] arr = {0, 1, 2, 2, 2};
        assertEquals(4, new NumberOfArithmeticSlices446().numberOfArithmeticSlices(arr));
    }

    @Test
    public void test04() {
        int[] arr = {0, 2000000000, -294967296};
        assertEquals(0, new NumberOfArithmeticSlices446().numberOfArithmeticSlices(arr));
    }

    @Test
    public void test05() {
        int[] arr = {1, 1, 1, 1, 1};
        assertEquals(16, new NumberOfArithmeticSlices446().numberOfArithmeticSlices(arr));
    }
}