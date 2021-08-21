package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Rob337 {
    Map<TreeNode, Integer> memo = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) return 0;

        if (memo.containsKey(root)) {
            return memo.get(root);
        }

        if (root.left == null && root.right == null) {
            memo.put(root, root.val);
            return root.val;
        }

        if (root.left != null && root.right == null) {
            int v = Math.max(rob(root.left), root.val + rob(root.left.left) + rob(root.left.right));
            memo.put(root, v);
            return v;
        }

        if (root.left == null && root.right != null) {
            int v = Math.max(rob(root.right), root.val + rob(root.right.left) + rob(root.right.right));
            memo.put(root, v);
            return v;
        }


        int v = Math.max(rob(root.left) + rob(root.right),
                root.val + rob(root.left.left) + rob(root.left.right) + rob(root.right.left) + rob(root.right.right));
        memo.put(root, v);
        return v;
    }

    public static void main(String[] args) {

        TreeNode treeNode = TreeNode.build("[4,2,null,1,3]");
        System.out.println(new Rob337().rob(treeNode));
    }
}
