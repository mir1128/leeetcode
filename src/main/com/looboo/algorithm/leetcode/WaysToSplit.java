package com.looboo.algorithm.leetcode;

public class WaysToSplit {
    public int waysToSplit(int[] nums) {

        int n = nums.length;
        int[] prefix = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }

        int total = 0;
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[n - 1] < 3 * prefix[i]) break;

            int time2 = binarySearch(prefix, 2 * prefix[i], i + 1);

            if (time2 == -1) break;

            int mid1 = binarySearch(prefix, prefix[time2] - prefix[i], time2 + 1);

            if (mid1 == -1) break;

        }
        return total;
    }

    private int binarySearch(int[] prefix, int target, int start) {
        int left = start;
        int right = prefix.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prefix[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return prefix[left] >= target ? left : -1;
    }

    private int binarySearch2(int[] prefix, int target, int start) {
        int left = start;
        int right = prefix.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prefix[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return prefix[left] >= target ? left : -1;
    }


    public int waysToSplit1(int[] nums) {

        int n = nums.length;
        int[] prefix = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }

        int ans = 0;
        for (int i = 1, l = 0, r = 0; i + 1 < n; i += 1) {
            int L = 2 * prefix[i - 1], R = (prefix[n - 1] - prefix[i - 1]) / 2 + nums[i - 1];
            if (L > R) continue;
            l = Math.max(l, i);
            r = Math.max(r, i + 1);
            while (l < n - 1 && prefix[l] < L) l += 1;
            while (r < n - 1 && prefix[r] <= R) r += 1;
            if (l < r) ans += r - l;
            ans %= 1000000007;
        }
        return ans;
    }
}
