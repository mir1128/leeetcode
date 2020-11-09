package com.looboo.algorithm.leetcode;

public class RebuildTreeOffer07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0 || inorder.length == 0) return null;

        return build(preorder, inorder, 0, 0, preorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int rootIndex, int begin, int end) {
        int n = preorder.length;
        TreeNode root = new TreeNode(preorder[rootIndex]);
        if (begin == end) {
            return root;
        }

        int index = index(inorder, preorder[rootIndex]);

        if (begin < index && index < end) {
            root.left = build(preorder, inorder, rootIndex + 1, begin, index - 1);
            root.right = build(preorder, inorder, rootIndex + 1 + (index - begin), index + 1, end);
        } else if (begin == index) {
            root.right = build(preorder, inorder, rootIndex + 1, index + 1, end);
        } else if (index == end) {
            root.left = build(preorder, inorder, rootIndex + 1, begin, index - 1);
        }

        return root;
    }

    private int index(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
