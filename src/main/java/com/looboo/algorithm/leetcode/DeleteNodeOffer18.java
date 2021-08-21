package com.looboo.algorithm.leetcode;

public class DeleteNodeOffer18 {
    public ListNode deleteNode(ListNode head, int val) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null && curr.val != val) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
        curr.next = null;

        return dummy.next;
    }
}
