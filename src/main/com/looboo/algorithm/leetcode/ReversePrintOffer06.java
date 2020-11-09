package com.looboo.algorithm.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class ReversePrintOffer06 {
    public int[] reversePrint(ListNode head) {

        Deque<Integer> deque = new LinkedList<>();

        ListNode curr = head;

        while (curr != null) {
            deque.addFirst(curr.val);
            curr = curr.next;
        }
        return deque.stream().mapToInt(i -> i).toArray();
    }
}
