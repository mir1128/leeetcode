package com.looboo.algorithm.leetcode;

public class MergeInBetween {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode prev;
        ListNode current = list1;

        int n = 0;

        ListNode aNode = null;
        while (n <= b) {
            prev = current;
            current = current.next;
            n++;
            if (n == a) {
                aNode = prev;
            }
        }

        aNode.next = list2;

        ListNode p = list2;
        while (p.next != null) p = p.next;
        p.next = current;

        return list1;
    }
}
