package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestDistance243Test {
    @Test
    public void test01() {
        String[] arr = new String[]{"a", "c", "b", "a"};
        assertEquals(1, new ShortestDistance243().shortestDistance(arr, "a", "b"));
    }

    @Test
    public void test02() {
        String[] arr = new String[]{"a","c","b","b","a"};
        assertEquals(1, new ShortestDistance243().shortestDistance(arr, "a", "b"));
    }

}