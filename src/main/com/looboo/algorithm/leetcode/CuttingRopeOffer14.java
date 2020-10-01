package com.looboo.algorithm.leetcode;

public class CuttingRopeOffer14 {
    class Solution {
        public int cuttingRope(int n) {
            if (n <= 3) return n - 1;
            long res = 1L;
            int p = (int) 1e9 + 7;

            while (n > 4) {
                res = res * 3 % p;
                n -= 3;
            }
            return (int) (res * n % p);
        }
    }
}
