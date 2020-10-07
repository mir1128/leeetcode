package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfDistancesInTreeTest {

    @Test
    public void test01() {
        int[][] edges = {{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}};

        assertArrayEquals(new int[]{8, 12, 6, 10, 10, 10}, new SumOfDistancesInTree().sumOfDistancesInTree(6, edges));
    }

    @Test
    public void test02() {
        int[][] edges = {{1, 0}};

        assertArrayEquals(new int[]{1, 1}, new SumOfDistancesInTree().sumOfDistancesInTree(2, edges));
    }

    @Test
    public void test03() {
        int[][] edges = {{2, 0}, {1, 0}};

        assertArrayEquals(new int[]{2, 3, 3}, new SumOfDistancesInTree().sumOfDistancesInTree(3, edges));
    }

    @Test
    public void test04() {
        int[][] edges = {{2,1}, {0, 2}};

        assertArrayEquals(new int[]{3, 3, 2}, new SumOfDistancesInTree().sumOfDistancesInTree(3, edges));
    }
}