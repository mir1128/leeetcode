package com.looboo.algorithm.leetcode;

public class InsertionSortList147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = null;

        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = null;
            insert(dummy, current);
            current = next;
        }

        return dummy.next;
    }

    private void insert(ListNode dummy, ListNode node) {
        ListNode current = dummy.next;

        if (current == null) {
            dummy.next = node;
            return;
        }

        ListNode prev = dummy;
        while (current != null) {
            ListNode next = current.next;

            if (current.val <= node.val) {
                prev = current;
                current = next;
            } else {
                prev.next = node;
                node.next = current;
                return;
            }
        }

        prev.next = node;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,1,3};
        ListNode node = new InsertionSortList147().insertionSortList(ListNode.build(arr));
        ListNode.printLinkList(node);
    }
}
