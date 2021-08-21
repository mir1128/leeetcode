package com.looboo.algorithm.leetcode;

public class SortList148 {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode list1 = head;
        ListNode list2 = slow.next;
        slow.next = null;

        return merge(sortList(list1), sortList(list2));
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;


        ListNode l1Current = l1;
        ListNode l2Current = l2;

        while (l1Current != null && l2Current != null) {
            if (l1Current.val <= l2Current.val) {
                current.next = l1Current;
                l1Current =l1Current.next;
                current = current.next;
                current.next = null;
            } else {
                current.next = l2Current;
                l2Current = l2Current.next;
                current = current.next;
                current.next = null;
            }
        }

        if (l1Current == null) {
            current.next = l2Current;
        }

        if (l2Current == null) {
            current.next = l1Current;
        }

        return dummy.next;
    }


}
