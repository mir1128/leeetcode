package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteAndEarn740Test {

    //2,3,4
    @Test
    public void test01() {
        int[] arr = {3, 4, 2};
        assertEquals(6, new DeleteAndEarn740().deleteAndEarn(arr));
    }

    @Test
    public void test02() {
        int[] arr = {2, 2, 3, 3, 3, 4};
        assertEquals(9, new DeleteAndEarn740().deleteAndEarn(arr));
    }

    @Test
    public void test03() {
        int[] arr = {1, 1, 1, 2, 4, 5, 5, 5, 6};
        assertEquals(18, new DeleteAndEarn740().deleteAndEarn(arr));
    }
}