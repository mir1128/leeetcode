package com.looboo.algorithm.leetcode;

public class DeleteNode237 {
    public void deleteNode(ListNode node) {
        if (null == null) return;

        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}
