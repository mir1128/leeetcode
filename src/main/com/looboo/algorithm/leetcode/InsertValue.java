package com.looboo.algorithm.leetcode;

public class InsertValue {

    public static class Node {
        public int val;
        public Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    public Node insert(Node head, int insertVal) {
        if (head ==null) {
            Node node = new Node(insertVal);
            node.next = node;
            return node;
        }

        if (head.next == head) {
            Node node = new Node(insertVal);
            node.next = head;
            head.next = node;
            return head;
        }

        Node cur = head.next;
        Node pre = head;

        Node node = new Node(insertVal);
        while (cur != head) {
            if (pre.val <= insertVal && cur.val >= insertVal) {
                pre.next = node;
                node.next = cur;
                return head;
            }

            if (pre.val > cur.val) {
                if (insertVal >= pre.val || insertVal <= cur.val) {
                    pre.next = node;
                    node.next = cur;
                    return head;
                }
            }
            cur = cur.next;
            pre = pre.next;
        }

        pre.next = node;
        node.next = head;

        return head;
    }

    public Node insert1(Node head, int insertVal) {
        Node node = new Node(insertVal);

        if (head ==null) {
            node.next = node;
            return node;
        }

        if (head.next == head) {
            node.next = head;
            head.next = node;
            return head;
        }

        Node pre = head;
        Node curr = head.next;

        while (curr != head) {
            if (pre.val <= curr.val) {
                if (pre.val <= insertVal && insertVal <= curr.val) {
                    pre.next = node;
                    node.next = curr;
                    return head;
                }
            } else {
                if (pre.val <= insertVal || insertVal <= curr.val) {
                    pre.next = node;
                    node.next = curr;
                    return head;
                }
            }
            pre = pre.next;
            curr = curr.next;
        }

        pre.next = node;
        node.next = curr;
        return head;
    }

}
