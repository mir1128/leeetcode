package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class IslandPerimeter463Test {

    @Test
    public void test01() {
        int[][] ints = Utils.intArray2d("[[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]");
        assertEquals(16, new IslandPerimeter463().islandPerimeter(ints));
    }
}