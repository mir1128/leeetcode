package com.looboo.algorithm.leetcode;

public class DeleteDuplicates82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;
        ListNode next = head.next;

        while (next != null) {
            boolean find = false;
            while (next != null && curr.val == next.val) {
                next = next.next;
                curr.next = next;
                find = true;
            }

            if (find) {
                if (next != null) {
                    curr = next;
                    next = next.next;
                    prev.next = curr;
                } else {
                    prev.next = null;
                }
            } else {
                if (next != null) {
                    prev = curr;
                    curr = next;
                    next = next.next;
                }
            }
        }

        return dummy.next;
    }
}
