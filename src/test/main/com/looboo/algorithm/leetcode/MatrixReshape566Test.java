package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixReshape566Test {
    @Test
    public void test01() {
        int[][] ints = Utils.intArray2d("[[1,2],[3,4]]");
        Utils.print(new MatrixReshape566().matrixReshape(ints, 4, 1));
    }
}