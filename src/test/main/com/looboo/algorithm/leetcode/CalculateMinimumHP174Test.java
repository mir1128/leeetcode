package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateMinimumHP174Test {
    @Test
    public void test01() {
        int[][] arr = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};

        assertEquals(7, new CalculateMinimumHP174().calculateMinimumHP(arr));
    }

    @Test
    public void test02() {
        int[][] arr = {{-3}, {-7}};
        assertEquals(11, new CalculateMinimumHP174().calculateMinimumHP(arr));
    }

    @Test
    public void test03() {
        int[][] arr = {{1, -3, 3}, {0, -2, 0}, {-3, -3, -3}};
        assertEquals(3, new CalculateMinimumHP174().calculateMinimumHP(arr));
    }

    @Test
    public void test04() {
        int[][] arr = {{-3, 5}};
        assertEquals(4, new CalculateMinimumHP174().calculateMinimumHP(arr));
    }

    @Test
    public void test05() {
        int[][] arr = {{2, 1}, {1, -1}};
        assertEquals(1, new CalculateMinimumHP174().calculateMinimumHP(arr));
    }

}