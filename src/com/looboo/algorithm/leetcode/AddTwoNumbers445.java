package com.looboo.algorithm.leetcode;

import java.util.List;
import java.util.Stack;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class AddTwoNumbers445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = toNumber(l1) + toNumber(l2);

        if (sum == 0) return new ListNode(0);

        ListNode dummy = new ListNode(-1);

        while (sum != 0) {
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = dummy.next;
            dummy.next = newNode;
            sum = sum / 10;
        }
        return dummy.next;
    }

    private int toNumber(ListNode head) {
        ListNode current = head;
        int sum = 0;
        while (current != null) {
            sum = sum * 10 + current.val;
            current = current.next;
        }
        return sum;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = pushStack(l1);
        Stack<Integer> s2 = pushStack(l2);

        ListNode dummy = new ListNode(-1);
        int full = 0;
        while (!s1.isEmpty() && !s2.isEmpty()) {
            int val = s1.pop() + s2.pop() + full;
            if (val >= 10) {
                val -= 10;
                full = 1;
            } else {
                full = 0;
            }

            ListNode node = new ListNode(val);
            node.next = dummy.next;
            dummy.next = node;
        }

        while (!s1.isEmpty()) {
            int val = s1.pop() + full;
            if (val >= 10) {
                val -= 10;
                full = 1;
            } else {
                full = 0;
            }

            ListNode node = new ListNode(val);
            node.next = dummy.next;
            dummy.next = node;
        }

        while (!s2.isEmpty()) {
            int val = s2.pop() + full;
            if (val >= 10) {
                val -= 10;
                full = 1;
            } else {
                full = 0;
            }

            ListNode node = new ListNode(val);
            node.next = dummy.next;
            dummy.next = node;
        }

        if (full == 1) {
            ListNode node = new ListNode(1);
            node.next = dummy.next;
            dummy.next = node;
        }

        return dummy.next;
    }

    private Stack<Integer> pushStack(ListNode l1) {
        Stack<Integer> s1 = new Stack<>();


        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        return s1;
    }

    public static void main(String[] args) {
        int arr1[] = {3, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int arr2[] = {7};

        ListNode list1 = ListNode.build(arr1);
        ListNode list2 = ListNode.build(arr2);

        ListNode listNode = new AddTwoNumbers445().addTwoNumbers2(list1, list2);
        ListNode.printLinkList(listNode);
    }
}
