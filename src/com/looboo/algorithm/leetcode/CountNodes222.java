package com.looboo.algorithm.leetcode;

public class CountNodes222 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int depth = getDepth(root);
        int rightDepth = getDepth(root.right);
        if (rightDepth == depth - 1) {
            return (1 << rightDepth) + countNodes(root.right);
        } else {
            return countNodes(root.left) + (1 << rightDepth);
        }
    }

    private int getDepth(TreeNode root) {
        int level = 0;
        while (root != null) {
            ++level;
            root = root.left;
        }
        return level;
    }
}
