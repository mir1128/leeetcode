package com.looboo.algorithm.leetcode;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode build(int arr[]) {

        if (arr.length == 0) return null;

        ListNode current = new ListNode(arr[0]);
        ListNode result = current;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return result;
    }

    public static void printLinkList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print("" + current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
