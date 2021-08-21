package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindInMountainArray1095Test {
    @Test
    public void test01() {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        MountainArray mountainArray = new MountainArray(arr);

        assertEquals(2, new FindInMountainArray1095().findInMountainArray(3, mountainArray));
    }

    @Test
    public void test02() {
        int[] arr = {0, 5, 3, 1};
        MountainArray mountainArray = new MountainArray(arr);

        assertEquals(3, new FindInMountainArray1095().findInMountainArray(1, mountainArray));
    }
}