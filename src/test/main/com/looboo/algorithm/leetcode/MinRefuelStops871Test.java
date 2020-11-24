package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinRefuelStops871Test {
    @Test
    public void test01() {
        int[][] stations = Utils.intArray2d("[[10,60],[20,30],[30,30],[60,40]]");
        assertEquals(2, new MinRefuelStops871().minRefuelStops(100, 10, stations));
    }

    @Test
    public void test02() {
        int[][] stations = Utils.intArray2d("[[10,100]]");
        assertEquals(-1, new MinRefuelStops871().minRefuelStops(100, 1, stations));
    }

    @Test
    public void test03() {
        int[][] stations = {};
        assertEquals(0, new MinRefuelStops871().minRefuelStops(1, 1, stations));
    }

    @Test
    public void test04() {
        int[][] stations = Utils.intArray2d("[[50,50]]");
        assertEquals(1, new MinRefuelStops871().minRefuelStops(100, 50, stations));
    }

    @Test
    public void test05() {
        int[][] stations = Utils.intArray2d("[[25,25],[50,25],[75,25]]");
        assertEquals(3, new MinRefuelStops871().minRefuelStops(100, 25, stations));
    }
}