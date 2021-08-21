package com.looboo.algorithm.leetcode;

public class BuildTree105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder == null || inorder == null) return null;
        if (preorder.length == 0 || inorder.length == 0) return null;

        int index = 0;
        while (index < inorder.length) {
            if (preorder[0] == inorder[index]) break;
            ++index;
        }

        int[] leftPartInOrder = null;
        int[] leftPartPreOrder = null;
        if (index != 0) {
            leftPartInOrder = new int[index];
            leftPartPreOrder = new int[index];
            System.arraycopy(inorder, 0, leftPartInOrder, 0, index);
            System.arraycopy(preorder, 1, leftPartPreOrder, 0, index);
        }

        int[] rightPartInOrder = null;
        int[] rightPartPreorder = null;
        if (index != inorder.length - 1) {
            rightPartInOrder = new int[inorder.length - 1 - index];
            rightPartPreorder = new int[inorder.length - 1 - index];
            System.arraycopy(inorder, index + 1, rightPartInOrder, 0, inorder.length - 1 - index);
            System.arraycopy(preorder, index + 1, rightPartPreorder, 0, inorder.length - 1 - index);
        }

        TreeNode root = new TreeNode(preorder[0]);
        root.left = buildTree(leftPartPreOrder, leftPartInOrder);
        root.right = buildTree(rightPartPreorder, rightPartInOrder);

        return root;
    }
}
