package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumEquivDominoPairs1128Test {

    @Test
    public void test01() {
        int[][] ints = Utils.intArray2d("[[1,2],[2,1],[3,4],[5,6]]");
        assertEquals(1, new NumEquivDominoPairs1128().numEquivDominoPairs(ints));
    }

    @Test
    public void test02() {
        int[][] ints = Utils.intArray2d("[[1,2],[1,2],[1,1],[1,2],[2,2]]");
        assertEquals(3, new NumEquivDominoPairs1128().numEquivDominoPairs(ints));
    }


}