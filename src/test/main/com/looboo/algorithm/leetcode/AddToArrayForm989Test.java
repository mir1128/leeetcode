package com.looboo.algorithm.leetcode;

import org.junit.Test;

public class AddToArrayForm989Test {
    @Test
    public void test01() {
        int[] arr = {1,2,0,0};
        System.out.println(new AddToArrayForm989().addToArrayForm(arr, 34));
    }

    @Test
    public void test02() {
        int[] arr = {2,7,4};
        System.out.println(new AddToArrayForm989().addToArrayForm(arr, 181));
    }
    @Test
    public void test03() {
        int[] arr = {2,1,5};
        System.out.println(new AddToArrayForm989().addToArrayForm(arr, 806));
    }
}