package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeastInterval621Test {
    @Test
    public void test01() {
        char [] arr = {'A','A','A','B','B','B'};
        assertEquals(8, new LeastInterval621().leastInterval(arr, 2));
    }

    @Test
    public void test02() {
        char[] arr = {'A','A','A','B','B','B'};
        assertEquals(6, new LeastInterval621().leastInterval(arr, 0));
    }

    @Test
    public void test03() {
        char[] arr = {'A','A','A','A','A','A','B','C','D','E','F','G'};
        assertEquals(16, new LeastInterval621().leastInterval(arr, 2));
    }
}