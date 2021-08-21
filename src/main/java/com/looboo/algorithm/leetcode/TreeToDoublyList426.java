package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeToDoublyList426 {
    public Node treeToDoublyList(Node root) {

        if (root == null) return null;

        Stack<Command> stack = new Stack<>();
        stack.push(new Command("go", root));

        Node pre = null;
        Node head = null;
        while (!stack.isEmpty()) {
            Command command = stack.pop();
            if (command.command.equals("visit")) {
                if (head == null) {
                    head = command.node;
                }
                command.node.left = pre;
                if (pre != null) {
                    pre.right = command.node;
                }
                pre = command.node;
            } else {
                if (command.node.right != null) {
                    stack.push(new Command("go", command.node.right));
                }
                stack.push(new Command("visit", command.node));
                if (command.node.left != null) {
                    stack.push(new Command("go", command.node.left));
                }
            }
        }

        head.left = pre;
        pre.right = head;

        return head;
    }


    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };

    public static class Command {
        public String command;
        public Node node;

        public Command(String command, Node node) {
            this.command = command;
            this.node = node;
        }
    }


    public static Node build1(String s) {
        String m = s.substring(1, s.length() - 1);
        String[] split = m.split(",");

        List<Node> nodeList = new ArrayList<>(split.length);

        List<Integer> nextIndex = new ArrayList<>();
        int next = 0;
        int n = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("null")) {
                nodeList.add(null);
            } else {
                nodeList.add(new Node(Integer.parseInt(split[i])));
                nextIndex.add(i);
            }

            if (i > 0) {
                if (n == 0) {
                    nodeList.get(nextIndex.get(next)).left = nodeList.get(i);
                    n++;
                } else {
                    nodeList.get(nextIndex.get(next)).right = nodeList.get(i);
                    n = 0;
                    next+=1;
                }
            }
        }
        return nodeList.get(0);
    }
}
