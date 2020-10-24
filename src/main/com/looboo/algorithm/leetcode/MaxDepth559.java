package com.looboo.algorithm.leetcode;

import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class MaxDepth559 {
    private int depth;

    public int maxDepth(Node root) {
        depth = 0;

        traverse(root, 1);
        return depth;
    }

    private void traverse(Node root, int curr) {
        if (root == null) return;

        if (curr > depth) {
            depth = curr;
        }

        for (int i = 0; i < root.children.size(); i++) {
            traverse(root.children.get(i), curr + 1);
        }
    }
}
