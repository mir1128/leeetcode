package com.looboo.algorithm.leetcode;

import java.util.List;

public class ConvertBST538 {

    private int current = 0;

    public TreeNode convertBST(TreeNode root) {

        current = 0;

        traverse(root);

        return root;
    }

    public void traverse(TreeNode root) {
        if (root == null) return;

        if (root.right != null) {
            traverse(root.right);
        }

        root.val += current;
        current = root.val;

        if (root.left != null) {
            traverse(root.left);
        }
    }

    public static void main(String[] args) {
        TreeNode build = TreeNode.build("[5,2,13]");
        TreeNode treeNode = new ConvertBST538().convertBST(build);
        int a = 0;
    }
}
