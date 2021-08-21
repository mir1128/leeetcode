package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxEnvelopes354Test {

    @Test
    public void test01() {
        int[][] arr = {{5,4},{6,4},{6,7},{2,3}};
        assertEquals(3, new MaxEnvelopes354().maxEnvelopes(arr));
    }
}