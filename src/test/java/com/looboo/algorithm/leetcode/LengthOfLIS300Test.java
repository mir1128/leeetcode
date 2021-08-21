package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLIS300Test {
    @Test
    public void test01() {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, new LengthOfLIS300().lengthOfLIS(arr));
    }

    @Test
    public void test02() {
        int[] arr = {1, 3, 6, 7, 9, 4, 10, 5, 6};
        assertEquals(6, new LengthOfLIS300().lengthOfLIS(arr));
    }
}