package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DailyTemperatures739Test {
    @Test
    public void test01() {
        int[] arr =    {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expect = {1, 1,   4,   2,  1,  1,  0,  0};

        assertArrayEquals(expect, new DailyTemperatures739().dailyTemperatures(arr));
    }
}