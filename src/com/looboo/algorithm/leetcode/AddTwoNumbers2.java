package com.looboo.algorithm.leetcode;

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Current = l1;
        ListNode l2Current = l2;

        boolean isFull = false;

        ListNode result = new ListNode(-1);
        ListNode current = result;

        while (l1Current != null && l2Current != null) {
            int val = l1Current.val + l2Current.val + (isFull ? 1 : 0);
            if (val >= 10) {
                val -= 10;
                isFull = true;
            } else {
                isFull = false;
            }
            current.next = new ListNode(val);
            current = current.next;
            l1Current = l1Current.next;
            l2Current = l2Current.next;
        }

        if (l1Current == null) {
            while (l2Current != null) {
                int val = l2Current.val + (isFull ? 1 : 0);
                if (val >= 10) {
                    val -= 10;
                    isFull = true;
                } else {
                    isFull = false;
                }

                current.next = new ListNode(val);
                current = current.next;
                l2Current = l2Current.next;
            }
        }

        if (l2Current == null) {
            while (l1Current != null) {
                int val = l1Current.val + (isFull ? 1 : 0);
                if (val >= 10) {
                    val -= 10;
                    isFull = true;
                } else {
                    isFull = false;
                }

                current.next = new ListNode(val);
                current = current.next;
                l1Current = l1Current.next;
            }
        }
        if (isFull) {
            current.next = new ListNode(1);
        }
        return result.next;
    }

    public static void main(String[] args) {
        int arr1[] = {9,8};
        int arr2[] = {1};

        ListNode list1 = ListNode.build(arr1);
        ListNode list2 = ListNode.build(arr2);

        ListNode listNode = new AddTwoNumbers2().addTwoNumbers(list1, list2);
        ListNode.printLinkList(listNode);
    }
}
