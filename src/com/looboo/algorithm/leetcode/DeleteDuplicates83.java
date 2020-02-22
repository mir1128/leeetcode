package com.looboo.algorithm.leetcode;

public class DeleteDuplicates83 {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;

        ListNode current = head;
        ListNode next = current.next;

        while (next != null) {
            if (current.val == next.val) {
                current.next = next.next;
            } else {
                current = next;
            }
            next = next.next;
        }

        return head;
    }
}
