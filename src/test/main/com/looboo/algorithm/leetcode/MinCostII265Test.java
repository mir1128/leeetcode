package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinCostII265Test {
    @Test
    public void test01() {
        int[][] ints = Utils.intArray2d("[[1,5,3],[2,9,4]]");
        assertEquals(5, new MinCostII265().minCostII(ints));
    }
}