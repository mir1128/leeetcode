package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumberOfLIS673Test {

    @Test
    public void test01() {
        int arr[] = {1, 3, 5, 4, 7};
        assertEquals(2, new FindNumberOfLIS673().findNumberOfLIS(arr));
    }

    @Test
    public void test02() {
        int arr[] = {2, 2, 2, 2, 2};
        assertEquals(5, new FindNumberOfLIS673().findNumberOfLIS(arr));
    }

    @Test
    public void test03() {
        int arr[] = {1, 2, 4, 3, 5, 4, 7, 2};
        assertEquals(3, new FindNumberOfLIS673().findNumberOfLIS(arr));
    }

    @Test
    public void test04() {
        int arr[] = {1, 1, 1, 2, 2, 2, 3, 3, 3};
        assertEquals(27, new FindNumberOfLIS673().findNumberOfLIS(arr));
    }
}