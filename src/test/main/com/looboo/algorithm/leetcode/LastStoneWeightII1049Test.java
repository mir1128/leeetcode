package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LastStoneWeightII1049Test {

    @Test
    public void test01() {
        int[] arr = {2, 7, 4, 1, 8, 1};
        assertEquals(1, new LastStoneWeightII1049().lastStoneWeightII(arr));
    }

    @Test
    public void test02() {
        int[] arr = {1, 3};
        assertEquals(2, new LastStoneWeightII1049().lastStoneWeightII(arr));
    }

    @Test
    public void test03() {
        int[] arr = {4, 3, 4, 3, 2};
        assertEquals(2, new LastStoneWeightII1049().lastStoneWeightII(arr));
    }
}