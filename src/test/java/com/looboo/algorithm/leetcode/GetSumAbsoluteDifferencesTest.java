package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetSumAbsoluteDifferencesTest {
    @Test
    public void test01() {
        assertArrayEquals(new int[] {4, 3,5}, new GetSumAbsoluteDifferences().getSumAbsoluteDifferences(new int[]{2,3,5}));
    }
}