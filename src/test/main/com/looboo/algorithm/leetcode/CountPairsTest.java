package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountPairsTest {
    @Test
    public void test01() {
        int[] ints = Utils.intArray1d("[1,1,1,3,3,3,7]");
        assertEquals(15, new CountPairs().countPairs1(ints));
    }

    @Test
    public void test02() {
        int[] ints = Utils.intArray1d("[1,3,5,7,9]");
        assertEquals(4, new CountPairs().countPairs1(ints));
    }

    @Test
    public void test03() {
        int[] ints = Utils.intArray1d("[2160,1936,3,29,27,5,2503,1593,2,0,16,0,3860,28908,6,2,15,49,6246,1946,23,105,7996,196,0,2,55,457,5,3,924,7268,16,48,4,0,12,116,2628,1468]");
        assertEquals(53, new CountPairs().countPairs1(ints));
    }
}