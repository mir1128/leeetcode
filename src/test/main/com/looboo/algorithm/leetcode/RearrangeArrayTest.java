package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class RearrangeArrayTest {
    @Test
    public void test01() {
        int[] ints = new RearrangeArray().rearrangeArray(Utils.intArray1d("[1,2,3,4,5]"));

        assertTrue(verify(ints));
    }

    @Test
    public void test02() {
        int[] ints = new RearrangeArray().rearrangeArray(Utils.intArray1d("[1,2,3]"));

        Utils.print(ints);
        assertTrue(verify(ints));
    }



    @Test
    public void test03() {
        int[] ints = new RearrangeArray().rearrangeArray(Utils.intArray1d("[0,12,8,14,9,13,17,15]"));

        assertTrue(verify(ints));
    }

    @Test
    public void test04() {
        int[] ints = new RearrangeArray().rearrangeArray(Utils.intArray1d("[0,4,1,5,3]"));

        assertTrue(verify(ints));
    }

    @Test
    public void test05() {

        int[] ints = new RearrangeArray().rearrangeArray(Utils.intArray1d("[3,1,12,10,7,6,17,14,4,13]"));

        Utils.print(ints);
        assertTrue(verify(ints));
    }

    @Test
    public void test06() {

        int[] ints = new RearrangeArray().rearrangeArray(Utils.intArray1d("[1,3,2]"));

        Utils.print(ints);
        assertTrue(verify(ints));

    }

    private boolean verify(int[] num) {
        for (int i = 1; i < num.length - 1; i++) {
            if (num[i]*2 == num[i-1] + num[i+1]) return false;
        }
        return true;
    }
}