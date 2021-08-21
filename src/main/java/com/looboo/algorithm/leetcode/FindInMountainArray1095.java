package com.looboo.algorithm.leetcode;

public class FindInMountainArray1095 {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left = 0;
        int right = mountainArr.length()-1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid+1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int max = mountainArr.get(left);

        if(target == max) {
            return left;
        } else if (target > max) {
            return - 1;
        } else {
            int l = find(target, mountainArr, 0, left, true);
            if (l != -1) {
                return l;
            } else{
                return find(target, mountainArr, left + 1, mountainArr.length(), false);
            }

        }

    }

    private int find(int target, MountainArray mountainArr, int from ,int to, boolean increase) {
        int left = from;
        int right = to-1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ( (increase && mountainArr.get(mid) < target) || (!increase && mountainArr.get(mid) > target)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (mountainArr.get(left) == target) {
            return left;
        }
        return -1;
    }
}

