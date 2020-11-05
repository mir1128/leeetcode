package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class IncreasingBST897 {

    private List<TreeNode> nodes;

    public TreeNode increasingBST(TreeNode root) {
        nodes = new ArrayList<>();

        traverse(root);

        TreeNode treeNode = new TreeNode(nodes.get(0).val);
        TreeNode curr = treeNode;
        for (int i = 1; i < nodes.size() ; i++) {
            curr.right = new TreeNode(nodes.get(i).val);
            curr = curr.right;
        }
        return treeNode;
    }

    private void traverse(TreeNode current) {
        if (current.left != null) {
            traverse(current.left);
        }
        nodes.add(current);

        if (current.right != null) {
            traverse(current.right);
        }
    }
}
