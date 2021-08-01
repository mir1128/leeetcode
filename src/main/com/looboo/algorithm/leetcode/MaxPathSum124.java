package com.looboo.algorithm.leetcode;

public class MaxPathSum124 {

    private int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return result;
    }

    private int maxPath(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(maxPath(root.left), 0);
        int right = Math.max(maxPath(root.right), 0);

        result = Math.max(result, root.val + left + right);

        return root.val + Math.max(left, right);
    }
}
