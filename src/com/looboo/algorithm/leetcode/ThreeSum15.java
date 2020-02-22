package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum15 {

    private static class Pair implements Comparable {
        public int v1;
        public int v2;
        public int i;

        public Pair(int v1, int v2, int i) {
            this.v1 = v1;
            this.v2 = v2;
            this.i = i;
        }

        @Override
        public int compareTo(Object o) {
            Pair pair = (Pair) o;
            return Integer.compare(i, pair.i);
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {

        Map<Integer, List<Pair>> mapping = new HashMap<>();
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) return result;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = 0 - nums[i] - nums[j];
                mapping.computeIfAbsent(temp, k -> new ArrayList<>()).add(new Pair(nums[i], nums[j], i));
            }
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if (i - 1 >= 0 && nums[i] == nums[i - 1]) continue;

            int target = 0 - nums[i];
            if (nums[i] + nums[i + 1] > target || nums[nums.length - 1] + nums[nums.length - 2] < target) continue;

            if (!mapping.containsKey(nums[i])) continue;

            List<Pair> pairs = mapping.get(nums[i]);

            int bound = upperBound(pairs, i);

            if (bound == -1) continue;

            for (int j = bound; j < pairs.size(); j++) {
                result.add(Arrays.asList(nums[i], pairs.get(j).v1, pairs.get(j).v2));
            }
        }

        return result;
    }

    private int upperBound(List<Pair> pairs, int target) {
        int l = 0;
        int r = pairs.size() - 1;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (pairs.get(m).i <= target) l = m + 1;
            else r = m;
        }
        return l == pairs.size() - 1 ? -1 : l;
    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 0};
        System.out.println(new ThreeSum15().threeSum(arr));
    }
}

