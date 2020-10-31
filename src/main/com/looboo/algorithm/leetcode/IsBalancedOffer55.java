package com.looboo.algorithm.leetcode;

public class IsBalancedOffer55 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        try {
            return Math.abs(depth(root.left) - depth(root.right)) <= 1;
        } catch (RuntimeException e) {
            return false;
        }
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;

        int left = depth(node.left);
        int right = depth(node.right);

        if (Math.abs(left - right) > 1) throw new RuntimeException();

        return Math.max(left, right) + 1;
    }
}
