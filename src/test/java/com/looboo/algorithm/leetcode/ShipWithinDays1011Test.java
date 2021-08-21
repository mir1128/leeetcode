package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShipWithinDays1011Test {
    @Test
    public void test01() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(15, new ShipWithinDays1011().shipWithinDays(arr, 5));
    }

    @Test
    public void test02() {
        int[] arr = {3, 2, 2, 4, 1, 4};
        assertEquals(6, new ShipWithinDays1011().shipWithinDays(arr, 3));
    }

    @Test
    public void test03() {
        int[] ints = Utils.intArray1d("[1,2,3,1,1]");
        assertEquals(3, new ShipWithinDays1011().shipWithinDays(ints, 4));
    }
}