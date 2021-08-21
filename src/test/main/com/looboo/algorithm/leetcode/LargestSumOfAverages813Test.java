package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestSumOfAverages813Test {
    private double e = 0.000001;

    @Test
    public void test01() {
        int[] ints = Utils.intArray1d("[9,1,2,3,9]");
        assertTrue(Math.abs(20.0 - new LargestSumOfAverages813().largestSumOfAverages(ints, 3)) < e);
    }
}