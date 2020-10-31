package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LowestCommonAncestorOffer68 {

    private List<TreeNode> path1;
    private List<TreeNode> path2;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<>();
        traverse(root, stack, p, q);

        for (int i = path1.size() - 1; i >= 0; i--) {
            for (int j = path2.size() - 1; j >= 0; j--) {
                if (path1.get(i).val == path2.get(j).val) return path2.get(j);
            }
        }
        return null;
    }

    private void traverse(TreeNode current, Stack<TreeNode> path, TreeNode p, TreeNode q) {
        if (p.val == current.val) {
            path1 = new ArrayList<>(path);
            path1.add(p);
        }

        if (q.val == current.val) {
            path2 = new ArrayList<>(path);
            path2.add(q);
        }

        if (path1 != null && path2 != null) {
            return;
        }

        path.push(current);
        if (current.left != null) {
            traverse(current.left, path, p, q);
        }
        if (current.right != null) {
            traverse(current.right, path, p, q);
        }
        path.pop();
    }
}
