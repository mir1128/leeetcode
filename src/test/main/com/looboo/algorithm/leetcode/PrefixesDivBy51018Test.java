package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrefixesDivBy51018Test {
    @Test
    public void test01() {
        int[] ints = Utils.intArray1d("[1,1,0,0,0,1,0,0,1]");
        assertEquals(Arrays.asList(false,false,false,false,false,false,false,false,false), new PrefixesDivBy51018().prefixesDivBy5(ints));
    }

    @Test
    public void test02() {
        int[] ints = Utils.intArray1d("[1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1]");
        List<Boolean> expected = Arrays.asList(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, true, true, true, false);
        assertEquals(expected, new PrefixesDivBy51018().prefixesDivBy5(ints));
    }
}