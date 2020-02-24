package com.looboo.algorithm.leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        return result;
    }

    private void preorderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        preorderTraversal(root.left, result);
        preorderTraversal(root.right, result);
    }

    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<Command> stack = new Stack<>();
        TreeNode current = root;
        stack.push(new Command("go", current));
        while (!stack.isEmpty()) {
            Command pop = stack.pop();
            if (pop.command.equals("visit")) {
                result.add(pop.treeNode.val);
            } else if (pop.command.equals("go")) {
                if (pop.treeNode.right != null) {
                    stack.push(new Command("go", pop.treeNode.right));
                }
                if (pop.treeNode.left != null) {
                    stack.push(new Command("go", pop.treeNode.left));
                }
                stack.push(new Command("visit", pop.treeNode));
            } else {
                //error
            }
        }

        return result;
    }
}
