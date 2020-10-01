package com.looboo.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TotalFruit904Test {
    @Test
    public void test1() {
        int arr[] = {1, 2, 1};
        Assert.assertEquals(3, new TotalFruit904().totalFruit(arr));
    }

    @Test
    public void test2() {
        int arr[] = {0, 1, 2, 2};
        Assert.assertEquals(3, new TotalFruit904().totalFruit(arr));
    }

    @Test
    public void test3() {
        int arr[] = {1, 2, 3, 2, 2};
        Assert.assertEquals(4, new TotalFruit904().totalFruit(arr));
    }

    @Test
    public void test4() {
        int arr[] = {3,3,3,1,2,1,1,2,3,3,4};
        Assert.assertEquals(5, new TotalFruit904().totalFruit(arr));
    }
}