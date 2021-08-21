package com.looboo.algorithm.luogu.list02;

import com.looboo.algorithm.generate.Generator;
import com.looboo.algorithm.leetcode.Utils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class P1923Test {
    @Test
    public void test01() {
        assertEquals(2, P1923.findKthMin(new int[]{4, 3, 2, 1, 5}, 1));
    }

    @Test
    public void test02() {

        int length = 100000;
        int k = 5000;

        int[] ints = Generator.generateRandomArray(length, 0, 20);

        int[] expect = new int[length];

        System.arraycopy(ints, 0, expect, 0, length);

        int kthMin = P1923.findKthMin(ints, k);

        Arrays.sort(expect);
        assertEquals(expect[k], kthMin);
    }

    @Test
    public void test03() {
        int length = 100;
        int k = 50;

        int[] ints = Generator.generateRandomArray(length, 0, 600000);

        int[] expect = new int[length];

        System.arraycopy(ints, 0, expect, 0, length);

        int kthMin = P1923_1.findKthMin(ints, k);

        Arrays.sort(expect);
        assertEquals(expect[k], kthMin);
    }

}