package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SwapNodes5652 {
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        System.out.println(list);

        int tmp = list.get(k);
        list.set(k, list.get(list.size() - k));
        list.set(list.size() - k, tmp);

        curr = head;
        int i = 0;
        while (curr != null) {
            curr.val = list.get(i);
            ++i;
        }
        return head;
    }
}
