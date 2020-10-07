package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class KConcatenationMaxSumTest {

    @Test
    public void test01() {
        int[] arr = {1, 2};
        assertEquals(9, new KConcatenationMaxSum().kConcatenationMaxSum(arr, 3));
    }

    @Test
    public void test02() {
        int[] arr = {1, -2, 1};
        assertEquals(2, new KConcatenationMaxSum().kConcatenationMaxSum(arr, 5));
    }

    @Test
    public void test03() {
        int[] arr = {-1, -2};
        assertEquals(0, new KConcatenationMaxSum().kConcatenationMaxSum(arr, 7));
    }

    @Test
    public void test04() throws IOException {
        int[] arr = Utils.loadFromTxt("KConcatenationMaxSumTest1.data");
        assertEquals(529991, new KConcatenationMaxSum().kConcatenationMaxSum(arr, 5263));
    }
}