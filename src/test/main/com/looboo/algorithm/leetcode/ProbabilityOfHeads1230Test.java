package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProbabilityOfHeads1230Test {
    @Test
    public void test01() {
        double[] arr = {0.4};
        assertEquals(0.40000, new ProbabilityOfHeads1230().probabilityOfHeads(arr, 1), 0.000001);
    }

    @Test
    public void test02() {
        double[] arr = {0.5, 0.5, 0.5, 0.5, 0.5};
        assertEquals(0.03125, new ProbabilityOfHeads1230().probabilityOfHeads(arr, 0), 0.0000001);
    }
}