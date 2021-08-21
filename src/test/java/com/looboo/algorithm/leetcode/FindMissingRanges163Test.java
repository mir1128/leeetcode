package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindMissingRanges163Test {
    @Test
    public void test01() {
        int[] ints = Utils.intArray1d("[0, 1, 3, 50, 75]");
        assertEquals(Arrays.asList("2", "4->49", "51->74", "76->99"), new FindMissingRanges163().findMissingRanges(ints, 0, 99));
    }
}