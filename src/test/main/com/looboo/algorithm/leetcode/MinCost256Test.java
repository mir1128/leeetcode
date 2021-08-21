package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinCost256Test {

    @Test
    public void test01() {
        int[][] ints = Utils.intArray2d("[[17,2,17],[16,16,5],[14,3,19]]");
        assertEquals(10, new MinCost256().minCost1(ints));
    }
}