package com.looboo.algorithm.leetcode;

public class OddEvenList328 {
    public ListNode oddEvenList(ListNode head) {

        ListNode oddNodes = new ListNode(-1);
        ListNode oddCurrent = oddNodes;

        ListNode evenNodes = new ListNode(-1);
        ListNode evenCurrent = evenNodes;

        ListNode current = head;
        int i = 1;
        while (current != null) {
            ListNode next = current.next;

            current.next = null;
            if (i % 2 == 1) {
                oddCurrent.next = current;
                oddCurrent = current;
            } else {
                evenCurrent.next = current;
                evenCurrent = current;
            }
            ++i;
            current = next;
        }

        oddCurrent.next = evenNodes.next;

        return oddNodes.next;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        ListNode build = ListNode.build(arr);
        ListNode result = new OddEvenList328().oddEvenList(build);
        ListNode.printLinkList(result);
    }
}
