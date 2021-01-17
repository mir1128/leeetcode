package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SummaryRanges228Test {
    @Test
    public void test01() {
        int[] arr = {0, 1, 2, 4, 5, 7};
        assertEquals(Arrays.asList("0->2", "4->5", "7"), new SummaryRanges228().summaryRanges(arr));
    }
}