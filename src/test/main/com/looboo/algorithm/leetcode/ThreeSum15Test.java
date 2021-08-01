package com.looboo.algorithm.leetcode;

import org.junit.Test;

public class ThreeSum15Test {
    @Test
    public void test01() {
        int[] ints = Utils.intArray1d("[-1,0,1,2,-1,-4]");

        System.out.println(new ThreeSum15().threeSum1(ints));
    }

    @Test
    public void test02() {
        int[] ints = Utils.intArray1d("[0,0,0]");

        System.out.println(new ThreeSum15().threeSum1(ints));
    }
}