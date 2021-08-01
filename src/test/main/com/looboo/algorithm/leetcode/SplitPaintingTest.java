package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.util.List;

public class SplitPaintingTest {
    @Test
    public void test01() {
        int[][] ints = Utils.intArray2d("[[1,4,5],[4,7,7],[1,7,9]]");
        List<List<Long>> lists = new SplitPainting().splitPainting(ints);

        System.out.println(lists);
    }

    @Test
    public void test02() {
        int[][] ints = Utils.intArray2d("[[1,7,9],[6,8,15],[8,10,7]]");
        List<List<Long>> lists = new SplitPainting().splitPainting(ints);
        System.out.println(lists);
    }

    @Test
    public void test03() {
        int[][] ints = Utils.intArray2d("[[1,4,5],[1,4,7],[4,7,1],[4,7,11]]");
        List<List<Long>> lists = new SplitPainting().splitPainting(ints);
        System.out.println(lists);
    }
}