package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumDivThree1262Test {

    @Test
    public void test01() {
        int[] arr = {3, 6, 5, 1, 8};
        assertEquals(18, new MaxSumDivThree1262().maxSumDivThree(arr));
    }

    @Test
    public void test02() {
        int[] arr = {1, 2, 3, 4, 4};
        assertEquals(12, new MaxSumDivThree1262().maxSumDivThree(arr));
    }

    @Test
    public void test03() {
        int[] arr = {4};
        assertEquals(0, new MaxSumDivThree1262().maxSumDivThree(arr));
    }

    @Test
    public void test04() {
        int[] arr = {2, 19, 6, 16, 5, 10, 7, 4, 11, 6};
        assertEquals(84, new MaxSumDivThree1262().maxSumDivThree(arr));
    }

    @Test
    public void test05() {
        int[] arr = {7, 3, 7, 4, 2, 2, 7, 5};
        assertEquals(33, new MaxSumDivThree1262().maxSumDivThree(arr));
    }

    @Test
    public void test06() {
        int[] arr = {8, 5, 4, 9, 2, 9, 10, 6};
        assertEquals(51, new MaxSumDivThree1262().maxSumDivThree(arr));
    }
}
