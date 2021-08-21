package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.utils.Utils;
import org.junit.Test;

public class SplitListToParts725Test {
    @Test
    public void test01() {
        int[] ints = Utils.intArray1d("[1,2,3,4]");
        new SplitListToParts725().splitListToParts(ListNode.build(ints), 5);
    }
}