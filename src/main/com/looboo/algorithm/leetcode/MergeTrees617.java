package com.looboo.algorithm.leetcode;

public class MergeTrees617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        merge(t1, t2);
        return t1;
    }

    private void merge(TreeNode t1, TreeNode t2) {
        if (t2 == null) return;

        if (t1 == null) {
            t1 = new TreeNode(t2.val);
        } else {
            t1.val += t2.val;
        }

        merge(t1.left, t2.left);
        merge(t1.right, t2.right);
    }
}
