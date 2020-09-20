package com.looboo.algorithm.leetcode;

import java.util.Stack;

public class ReverseKGroup25 {
    public ListNode reverseKGroup(ListNode head, int k) {

        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;
        int i = 1;

        ListNode result = new ListNode(-1);
        ListNode prev = result;

        while (current != null) {
            stack.push(current);
            current = current.next;
            if (i % k == 0) {
                while (!stack.isEmpty()) {
                    prev.next = stack.pop();
                    prev = prev.next;
                }
            }
            ++i;
        }

        prev.next = null;
        if (stack.size() != 0) {
            while (!stack.isEmpty()) {
                ListNode node = stack.pop();
                node.next = prev.next;
                prev.next = node;
            }
        }

        return result.next;
    }

    public static class Pair {
        public ListNode head;             //[head, tail]
        public ListNode tail;

        public Pair(ListNode head, ListNode tail) {
            this.head = head;
            this.tail = tail;
        }
    }

    public ListNode reverseKGroup2(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;

        Pair pair = getNextKNode(head, k);

        ListNode remained = head;
        while (pair != null) {
            remained = pair.tail.next;
            pair.tail.next = null;
            Pair reversedPair = reverse(pair.head);
            prev.next = reversedPair.head;
            prev = reversedPair.tail;
            pair = getNextKNode(remained, k);
        }

        prev.next = remained;

        return dummy.next;
    }

    private Pair getNextKNode(ListNode from, int k) {
        if (from == null) return null;

        ListNode current = from;
        int i = 0;
        while (current != null && i++ < k-1 ) current = current.next;

        if (i == k) return new Pair(from, current);
        return null;
    }

    private Pair reverse(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return new Pair(prev, dummy.next);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        ListNode build = ListNode.build(arr);
        ListNode node = new ReverseKGroup25().reverseKGroup2(build, 2);

        ListNode.printLinkList(node);
    }
}
