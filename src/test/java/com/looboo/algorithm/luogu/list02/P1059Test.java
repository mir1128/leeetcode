package com.looboo.algorithm.luogu.list02;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class P1059Test {
    @Test
    public void test01() {
        int[] arr = new int[]{20, 40, 32, 67, 40, 20, 89, 300, 400, 15};

        int solve = P1059.solve(arr);

        assertEquals(8, solve);

        int[] actual = new int[8];
        System.arraycopy(arr, 0, actual, 0, actual.length);
        assertArrayEquals(new int[]{15, 20, 32, 40, 67, 89, 300, 400}, actual);
    }
}