package com.looboo.algorithm.leetcode;

public class Partition86 {
    public ListNode partition(ListNode head, int x) {

        ListNode lessList = new ListNode(-1);
        ListNode lessCurrent = lessList;

        ListNode prev = new ListNode(-1);
        ListNode dummyHead = prev;
        prev.next = head;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            if (current.val < x) {
                prev.next = current.next;
                lessCurrent.next = current;
                current.next = null;
                lessCurrent = current;
            } else {
                prev = current;
            }
            current = next;
        }

        lessCurrent.next = dummyHead.next;
        return lessList.next;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5,2};
        ListNode build = ListNode.build(arr);

        ListNode partition = new Partition86().partition(build, 3);
        ListNode.printLinkList(partition);
    }
}
