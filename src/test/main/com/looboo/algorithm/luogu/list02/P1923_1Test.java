package com.looboo.algorithm.luogu.list02;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1923_1Test {
    @Test
    public void test01() {
        int[] arr = new int[]{4, 3, 2, 1, 5};
        assertEquals(2, P1923_1.quickSort(arr, 0, arr.length - 1, 1));
    }
}