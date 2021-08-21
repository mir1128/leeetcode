package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximalNetworkRank5536Test {

    @Test
    public void test01() {
        int[][] roads = {{0, 1}, {0, 3}, {1, 2}, {1, 3}, {2, 3}, {2, 4}};
        assertEquals(5, new MaximalNetworkRank5536().maximalNetworkRank(5, roads));
    }

    @Test
    public void test02() {
        int[][] roads = {{2,3},{0,3},{0,4},{4,1}};
        assertEquals(4, new MaximalNetworkRank5536().maximalNetworkRank(5, roads));
    }


}