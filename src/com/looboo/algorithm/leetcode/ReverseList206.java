package com.looboo.algorithm.leetcode;

public class ReverseList206 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode result = null;

        ListNode current = null;
        ListNode next = head;


        while (next != null) {
            current = next;
            next = next.next;

            current.next = result.next;
            result = current;
        }
        return result;
    }

    public ListNode reverseList1(ListNode head) {

        ListNode pre = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;

            current.next = pre;
            pre = current;
            current = next;
        }

        return pre;
    }
}
