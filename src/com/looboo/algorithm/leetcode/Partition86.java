package com.looboo.algorithm.leetcode;

public class Partition86 {
    public ListNode partition(ListNode head, int x) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null && current.val != x) {
            prev = current;
            current = current.next;
        }

        ListNode lessNode = current;

        while (lessNode != null) {
            ListNode next = lessNode.next;
            if (lessNode.val < x) {
                prev.next = lessNode;
                lessNode.next = current;
                prev = lessNode;
            }
            lessNode = next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5,2};
        ListNode build = ListNode.build(arr);

        ListNode partition = new Partition86().partition(build, 3);
        ListNode.printLinkList(partition);
    }
}
