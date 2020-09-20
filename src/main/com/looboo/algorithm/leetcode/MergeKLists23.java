package com.looboo.algorithm.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKLists23 {

    public static class Pair {
        ListNode node;
        int index;

        public Pair(ListNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        Queue<Pair> queue = new PriorityQueue<>(Comparator.comparingInt(p -> p.node.val));

        ListNode[] pointer = new ListNode[lists.length];
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null) continue;
            queue.add(new Pair(lists[i], i));
            pointer[i] = lists[i].next;
        }

        ListNode result = new ListNode(-1);
        ListNode current = result;
        while (!queue.isEmpty()) {
            Pair poll = queue.poll();
            current.next = poll.node;
            current = poll.node;
            current.next = null;
            int index = poll.index;
            if (pointer[index] != null) {
                queue.add(new Pair(pointer[index], index));
                pointer[index] = pointer[index].next;
            }
        }

        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.build(new int[]{1, 2, 3});
        ListNode l2 = ListNode.build(new int[]{1, 3, 4});
        ListNode l3 = ListNode.build(new int[]{2, 6});


        ListNode node = new MergeKLists23().mergeKLists(new ListNode[]{l1, l2, l3});
        ListNode.printLinkList(node);
    }
}
