package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfArithmeticSlices413Test {

    @Test
    public void test01() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(3, new NumberOfArithmeticSlices413().numberOfArithmeticSlices(arr));
    }

    @Test
    public void test02() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(10, new NumberOfArithmeticSlices413().numberOfArithmeticSlices(arr));
    }
}