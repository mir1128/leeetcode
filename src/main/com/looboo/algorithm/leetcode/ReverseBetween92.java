package com.looboo.algorithm.leetcode;

public class ReverseBetween92 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {

        if (head == null) return null;

        ListNode pre = null;
        ListNode current = head;
        ListNode next = null;

        int i = 1;
        while (i < m && current != null) {
            next = current.next;
            pre = current;
            current = next;
            ++i;
        }

        ListNode p = pre;
        ListNode q = current;

        while (i <= n && current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
            ++i;
        }

        if (p != null) p.next = pre;
        if (q != null) q.next = current;

        if (m == 1) return pre;

        return head;
    }


    public ListNode reverseBetween2(ListNode head, int m, int n) {

        ListNode pre = null;
        ListNode current = head;
        ListNode next = null;

        int i = 1;
        for (; i < m && current != null; ++i) {
            next = current.next;
            pre = current;
            current = next;
        }

        ListNode p = pre;
        ListNode q = current;

        for (; i <= n && current != null; ++i) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        if (p != null) p.next = pre;
        if (q != null) q.next = current;

        if (m == 1) return pre;
        return head;
    }


    public static void main(String[] args) {
        int arr[] = {3, 5};

    }
}
