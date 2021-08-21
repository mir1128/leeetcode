package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Candy135Test {

    @Test
    public void test01() {
        int[] arr = {1, 0, 2};
        assertEquals(5, new Candy135().candy(arr));
    }

    @Test
    public void test02() {
        int[] arr = {1, 2, 2};
        assertEquals(4, new Candy135().candy(arr));
    }
}