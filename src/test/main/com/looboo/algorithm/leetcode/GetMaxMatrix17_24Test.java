package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetMaxMatrix17_24Test {
    @Test
    public void test01() {
        int[][] arr = {{-1, 0}, {0, -1}};
        int[] maxMatrix = new GetMaxMatrix17_24().getMaxMatrix(arr);

        System.out.println(String.format("(%s, %s), (%s, %s)",
                maxMatrix[0],
                maxMatrix[1],
                maxMatrix[2],
                maxMatrix[3]
        ));
    }

    @Test
    public void test02() {
        int[][] arr = {{9, -8, 1, 3, -2}, {-3, 7, 6, -2, 4}, {6, -4, -4, 8, -7}};
        int[] maxMatrix = new GetMaxMatrix17_24().getMaxMatrix(arr);

        System.out.println(String.format("(%s, %s), (%s, %s)",
                maxMatrix[0],
                maxMatrix[1],
                maxMatrix[2],
                maxMatrix[3]
        ));
    }

    @Test
    public void test03() {
        int[][] arr = {{-1, -2, -9, 6}, {8, -9, -3, -6}, {2, 9, -7, -6}};

        int[] maxMatrix = new GetMaxMatrix17_24().getMaxMatrix(arr);

        System.out.println(String.format("(%s, %s), (%s, %s)",
                maxMatrix[0],
                maxMatrix[1],
                maxMatrix[2],
                maxMatrix[3]
        ));
    }
}