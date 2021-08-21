package com.looboo.algorithm.leetcode;

import java.util.Stack;

public class BSTIterator173_1 {

    private Stack<TreeNode> stack = new Stack<>();

    public BSTIterator173_1(TreeNode root) {
        push(root);
    }

    public int next() {
        TreeNode pop = stack.pop();
        push(pop.right);
        return pop.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void push(TreeNode root) {
        if (root == null) return;
        stack.push(root);
        TreeNode left = root.left;
        while (left != null) {
            stack.push(left);
            left = left.left;
        }
    }

}
