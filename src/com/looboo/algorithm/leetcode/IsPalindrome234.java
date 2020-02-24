package com.looboo.algorithm.leetcode;

public class IsPalindrome234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode list2 = slow.next;
        ListNode reversedList2 = reverse(list2);

        ListNode l1 = head;
        ListNode l2 = reversedList2;
        while (l1 != slow.next
                && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }

        return true;
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
        int arr[] = {1, 2};
        System.out.println(new IsPalindrome234().isPalindrome(ListNode.build(arr)));
    }

}
