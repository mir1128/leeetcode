package com.looboo.algorithm.leetcode;

import org.junit.Test;

public class DeleteDuplicates82Test {
    @Test
    public void test01() {
        ListNode build = ListNode.build(Utils.intArray1d("[1,2,3,3,4,4,5]"));
        ListNode node = new DeleteDuplicates82().deleteDuplicates(build);
    }

    @Test
    public void test02() {
        ListNode build = ListNode.build(Utils.intArray1d("[1,1]"));
        ListNode node = new DeleteDuplicates82().deleteDuplicates(build);
    }
}