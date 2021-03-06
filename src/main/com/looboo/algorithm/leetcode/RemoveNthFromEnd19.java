package com.looboo.algorithm.leetcode;

public class RemoveNthFromEnd19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode nth = dummy;
        int i = 0;
        while (i < n && nth != null) {
            nth = nth.next;
            ++i;
        }

        if (i < n || nth == null) return head;

        while (nth.next != null) {
            prev = prev.next;
            nth = nth.next;
        }

        ListNode next = prev.next;
        prev.next = next.next;
        next.next = null;
        return dummy.next;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        new RemoveNthFromEnd19().removeNthFromEnd(ListNode.build(arr), 2);
    }
}
