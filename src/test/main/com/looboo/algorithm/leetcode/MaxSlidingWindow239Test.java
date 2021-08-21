package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSlidingWindow239Test {
    @Test
    public void test01() {
        int[] ints = new MaxSlidingWindow239().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);

        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, ints);
    }

    @Test
    public void test02() {
        int[] ints = Utils.intArray1d("[-7,-8,7,5,7,1,6,0]");
        assertArrayEquals(new int[]{7, 7, 7, 7, 7}, new MaxSlidingWindow239().maxSlidingWindow(ints, 4));

    }
}