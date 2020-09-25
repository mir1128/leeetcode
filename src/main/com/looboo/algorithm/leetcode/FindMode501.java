package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindMode501 {

    private List<Pair> list;

    public int[] findMode(TreeNode root) {

        list = new ArrayList<>();

        traverse(root);

        if (list.size() >= 2 && list.get(list.size() - 1).count < list.get(list.size() - 2).count) {
            list.remove(list.size() - 1);
        }
        return list.stream().map(p -> p.val).mapToInt(i -> i).toArray();
    }


    public static class Pair {
        public int val;
        public int count;

        public Pair(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }

    private void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);

        if (list.size() == 0) {
            list.add(new Pair(root.val, 1));
        } else {
            Pair last = list.get(list.size() - 1);
            if (last.val == root.val) {
                last.count += 1;

                if (list.size() >= 2 && last.count > list.get(list.size() - 2).count) {
                    list = new ArrayList<>();
                    list.add(last);
                }
            } else {
                if (list.size() >= 2 && last.count < list.get(list.size() - 2).count) {
                    list.remove(list.size()-1);
                }

                list.add(new Pair(root.val, 1));

            }
        }

        traverse(root.right);
    }

    public static void main(String[] args) {
        TreeNode build = TreeNode.build1("[6,2,8,0,4,7,9,null,null,2,6]");
        int[] mode = new FindMode501().findMode(build);
        Utils.print(mode);
    }

}
