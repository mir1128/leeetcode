package com.looboo.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class BSTIterator173 {

    private Queue<Integer> result = new LinkedList<>();

    public BSTIterator173(TreeNode root) {
        traverse(root);
    }

    public int next() {
        return result.poll();
    }

    public boolean hasNext() {
        return !result.isEmpty();
    }

    private void traverse(TreeNode root) {
        if (root == null) return;
        if (root.left != null) traverse(root.left);
        result.add(root.val);
        if (root.right != null) traverse(root.right);
    }

}
