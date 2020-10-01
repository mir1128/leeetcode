package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeastOpsExpressTarget964 {
//    public int leastOpsExpressTarget(int x, int target) {
//
//        if (target == 1) return 0;
//
//        int e = 1;
//        List<Integer> exp = new ArrayList<>();
//        while (e < target) {
//            exp.add(e);
//            e *= x;
//        }
//        exp.add(e);
//
//        int dp[] = new int[exp.get(exp.size() - 1) + 1];
//
//        for (int i = 2; i <= target; i++) {
//            int index = findInExpTable(i, exp);
//            int lower = exp.get(index - 1);
//            int upper = exp.get(index);
//
//            if (upper - i < i - lower) {
//
//            }
//        }
//
//        Utils.print(dp);
//
//        return dp[target];
//    }
//
//    private int findInExpTable(int target, List<Integer> exp) {
//        int j = 0;
//        while (target > exp.get(j))
//            ++j;
//        return j;
//    }

//    Map<String, Integer> memo;
//    int x;
//
//    public int leastOpsExpressTarget(int x, int target) {
//        memo = new HashMap();
//        this.x = x;
//        return dp(0, target) - 1;
//    }
//
//    public int dp(int i, int target) {
//        String code = "" + i + "#" + target;
//        if (memo.containsKey(code))
//            return memo.get(code);
//
//        int ans;
//        if (target == 0) {
//            ans = 0;
//        } else if (target == 1) {
//            ans = cost(i);
//        } else if (i >= 39) {
//            ans = target + 1;
//        } else {
//            int t = target / x;
//            int r = target % x;
//            ans = Math.min(r * cost(i) + dp(i + 1, t),
//                    (x - r) * cost(i) + dp(i + 1, t + 1));
//        }
//
//        memo.put(code, ans);
//        return ans;
//    }
//
//    public int cost(int x) {
//        return x > 0 ? x : 2;
//    }

    public int leastOpsExpressTarget(int x, int target) {

        if (target == 0) return 0;

        if (target < x) {
            return Math.min(2 * target - 1, (x - target) * 2);
        }

        int e = (int) (Math.log(target) / Math.log(x));
        int lowerBound = (int) Math.pow(x, e);
        int upperBound = lowerBound * x;

        if (target == lowerBound) {
            return e - 1;
        }

        int lowCount = leastOpsExpressTarget(x, target - lowerBound) + e;

        if (upperBound - target < target) {
            return Math.min(lowCount, leastOpsExpressTarget(x, upperBound - target) + e + 1);
        }

        return lowCount;
    }

    public static void main(String[] args) {
        System.out.println(new LeastOpsExpressTarget964().leastOpsExpressTarget(100, 100000000));
    }


}
