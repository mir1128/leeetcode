package com.looboo.algorithm.leetcode;

public class ReorderList143 {
    public void reorderList(ListNode head) {
        if (head == null) return;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode list2 = slow.next;
        slow.next = null;

        ListNode reversedList2 = reverse(list2);

        ListNode l1 = head;
        ListNode l2 = reversedList2;

        ListNode next = null;
        while (l1 != null && l2 != null) {
            next = l1.next;
            l1.next = l2;
            l1 = next;
            next = l2.next;
            l2.next = l1;
            l2 = next;
        }
    }

    private ListNode reverse(ListNode list2) {
        ListNode prev = null;
        ListNode current = list2;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4, 5};
        ListNode build = ListNode.build(arr);
        new ReorderList143().reorderList(build);
        ListNode.printLinkList(build);
    }

}
