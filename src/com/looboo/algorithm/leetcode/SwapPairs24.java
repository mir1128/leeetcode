package com.looboo.algorithm.leetcode;

public class SwapPairs24 {
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;

        while (current != null && current.next != null) {
            ListNode next = current.next;
            prev.next = next;
            current.next = next.next;
            next.next = current;
            prev = current;
            current = current.next;
        }

        return dummy.next;
    }
}
