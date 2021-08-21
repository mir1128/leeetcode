package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetModifiedArray370Test {
    @Test
    public void test01() {
        int[][] ints = Utils.intArray2d("[[1,3,2],[2,4,3],[0,2,-2]]");
        assertArrayEquals(new int[] {-2,0,3,5,3}, new GetModifiedArray370().getModifiedArray(5, ints));
    }
}