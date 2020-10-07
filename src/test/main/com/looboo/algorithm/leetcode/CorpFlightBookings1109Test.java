package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class CorpFlightBookings1109Test {

    @Test
    public void test01() {
        int[][] arr = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        assertArrayEquals(new int[]{10, 55, 45, 25, 25}, new CorpFlightBookings1109().corpFlightBookings(arr, 5));
    }
}