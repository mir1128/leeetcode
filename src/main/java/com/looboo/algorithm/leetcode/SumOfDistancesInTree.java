package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SumOfDistancesInTree {
    public int[] sumOfDistancesInTree(int N, int[][] edges) {

        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nodes.add(new Node(i, null, new ArrayList<>(), new ArrayList<>()));
        }

        for (int i = 0; i < edges.length; i++) {
            Node node1 = nodes.get(edges[i][0]);
            Node node2 = nodes.get(edges[i][1]);
            node1.children.add(node2);
            node2.children.add(node1);
        }

        Node root = nodes.get(0);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node poll = queue.poll();

            for (Node node : poll.children) {
                if (node == poll) continue;

                node.parent = poll;
                int i = 0;
                Node parent = node.parent;
                while (parent != null) {
                    if (parent.levelCounts.size() <= i) {
                        parent.levelCounts.add(0);
                    }
                    parent.levelCounts.set(i, parent.levelCounts.get(i) + 1);
                    ++i;
                    parent = parent.parent;
                }
                queue.add(node);
            }
        }

        int[] res = new int[N];
        for (int i = 0; i < nodes.size(); i++) {
            res[i] = sum(nodes.get(i));
        }

        return res;
    }

    private int sum(Node node) {
        int sum = 0;
        for (int i = 0; i < node.levelCounts.size(); ++i) {
            sum += (i + 1) * node.levelCounts.get(i);
        }

        Node parent = node.parent;
        int i = 1;
        Node last = node;
        while (parent != null) {
            sum += i;
            for (int j = 0; j < parent.levelCounts.size(); j++) {
                if (j == 0) {
                    sum += (parent.levelCounts.get(0) - 1) * (j + i + 1);
                } else {
                    sum += (parent.levelCounts.get(j) - (last.levelCounts.size() > (j-1) ? last.levelCounts.get(j - 1) : 0)) * (j + i + 1);
                }
            }
            last = parent;
            parent = parent.parent;
            i++;
        }

        return sum;
    }

    private static class Node {
        public int val;
        public Node parent;
        public List<Node> children;
        public List<Integer> levelCounts;

        public Node(int val, Node parent, List<Node> children, List<Integer> levelCounts) {
            this.val = val;
            this.parent = parent;
            this.children = children;
            this.levelCounts = levelCounts;
        }
    }
}
