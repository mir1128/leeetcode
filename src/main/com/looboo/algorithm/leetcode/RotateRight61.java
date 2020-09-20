package com.looboo.algorithm.leetcode;

public class RotateRight61 {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) return head;

        ListNode current = head;
        ListNode nth = head;

        int i = 0;
        while (i < k) {
            nth = nth.next;
            if (nth == null) {
                nth = head;
            }
            ++i;
        }

        while (nth.next != null) {
            current = current.next;
            nth = nth.next;
        }

        if (current.next == null) return head;

        ListNode result = current.next;
        current.next = null;
        nth.next = head;

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2};
        ListNode node = new RotateRight61().rotateRight(ListNode.build(arr), 2);
        ListNode.printLinkList(node);
    }
}
