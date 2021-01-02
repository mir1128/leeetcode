package com.looboo.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class GetIntersectionNode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> set = new HashSet<>();
        ListNode curr = headA;
        while (curr != null) {
            set.add(curr);
            curr = curr.next;
        }

        curr = headB;
        while (curr != null) {
            if (set.contains(curr)) return curr;
            curr = curr.next;
        }

        return null;
    }
}
