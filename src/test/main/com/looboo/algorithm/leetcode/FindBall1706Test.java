package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindBall1706Test {
    @Test
    public void test01() {
        int[][] ints = Utils.intArray2d("[[1,1,1,-1,-1],[1,1,1,-1,-1],[-1,-1,-1,1,1],[1,1,1,1,-1],[-1,-1,-1,-1,-1]]");
        assertArrayEquals(new int[]{1, -1, -1, -1, -1}, new FindBall1706().findBall(ints));
    }

    @Test
    public void test02() {
        int[][] ints = Utils.intArray2d("[[-1]]");
        assertArrayEquals(new int[]{-1}, new FindBall1706().findBall(ints));
    }

    @Test
    public void test03() {
        int[][] ints = Utils.intArray2d("[[1,1,1,1,1,1],[-1,-1,-1,-1,-1,-1],[1,1,1,1,1,1],[-1,-1,-1,-1,-1,-1]]");
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, -1}, new FindBall1706().findBall(ints));
    }
}