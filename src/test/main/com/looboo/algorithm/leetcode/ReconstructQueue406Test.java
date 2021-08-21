package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

public class ReconstructQueue406Test {
    @Test
    public void test01() {
        int[][] ints = Utils.intArray2d("[[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]");

        int[][] ints1 = new ReconstructQueue406().reconstructQueue(ints);
    }
}