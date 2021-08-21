package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinCameraCover968 {
    public int minCameraCover(TreeNode root) {

        if (root.left == null && root.right == null) return 1;
        Map<TreeNode, Record> recordMap = new HashMap<>();
        visit(root, null, recordMap);

        int n = putCamera(recordMap, 3) + putCamera(recordMap, 2) + putCamera(recordMap, 1);

        return n;
    }

    private int putCamera(Map<TreeNode, Record> recordMap, int degree) {
        int n = 0;
        for (Map.Entry<TreeNode, Record> entry : recordMap.entrySet() ) {
            if (entry.getValue().degree == degree && !entry.getValue().visited) {
                n++;
                entry.getValue().visited = true;
                TreeNode node = entry.getKey();
                TreeNode parent = entry.getValue().parent;
                if (parent != null) recordMap.get(parent).visited = true;
                if (node.left != null) recordMap.get(node.left).visited = true;
                if (node.right != null) recordMap.get(node.right).visited = true;
            }
        }
        return n;
    }

    private void visit(TreeNode current, TreeNode parent, Map<TreeNode, Record> recordMap) {

        if (current == null) return;

        int degree = 0;
        if (parent != null) degree++;
        if (current.left != null) degree++;
        if (current.right != null) degree++;
        recordMap.put(current, new Record(parent, degree, false));

        if (current.left != null) visit(current.left, current, recordMap);
        if (current.right != null) visit(current.right, current, recordMap);
    }

    private static class Record {
        public TreeNode parent;
        public int degree;
        public boolean visited;

        public Record(TreeNode parent, int degree, boolean visited) {
            this.parent = parent;
            this.degree = degree;
            this.visited = visited;
        }
    }

    public static void main(String[] args) {
//        TreeNode build = TreeNode.build("[0,0,null,0,0]");
        TreeNode build = TreeNode.build1("[1,null,2,3,null,4,null,null,5]");
        System.out.println(new MinCameraCover968().minCameraCover(build));
    }
}
