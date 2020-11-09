package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindLeaves366 {
    public List<List<Integer>> findLeaves(TreeNode root) {

        TreeNode rootroot = new TreeNode(-1);
        rootroot.left = root;

        List<List<Integer>> result = new ArrayList<>();
        while (rootroot.left != null) {
            List<Integer> list = new ArrayList<>();
            traverse(root, rootroot, list);
            result.add(list);
        }
        return result;
    }

    private void traverse(TreeNode root, TreeNode parent, List<Integer> leaves) {
        if (root.left == null && root.right == null) {
            leaves.add(root.val);
            if (parent.left == root) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }

        if (root.left != null) {
            traverse(root.left, root, leaves);
        }
        if (root.right != null) {
            traverse(root.right, root, leaves);
        }
    }
}
