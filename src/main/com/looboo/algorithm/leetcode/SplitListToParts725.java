package com.looboo.algorithm.leetcode;

public class SplitListToParts725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int n = 0;
        ListNode curr = root;
        while (curr != null) {
            n++;
            curr = curr.next;
        }

        int count = n / k;
        int remain = n % k;

        ListNode[] result = new ListNode[k];

        curr = root;
        ListNode pre = null;
        for (int i = 0; i < k; i++) {
            result[i] = curr;
            int bulkCount = 0;
            while (bulkCount++ < (i < remain ? count + 1 : count) && curr != null) {
                pre = curr;
                curr = curr.next;
            }
            if (pre != null) {
                pre.next = null;
            }
        }
        return result;
    }
}
