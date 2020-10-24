package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MaxSlidingWindow59Test {

    @Test
    public void test01() {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};

        assertEquals("[3, 3, 5, 5, 6, 7]", Arrays.toString(new MaxSlidingWindow59().maxSlidingWindow(arr, 3)));
    }
}