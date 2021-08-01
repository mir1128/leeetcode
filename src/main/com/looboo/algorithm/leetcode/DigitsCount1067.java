package com.looboo.algorithm.leetcode;

public class DigitsCount1067 {
    public int digitsCount(int d, int low, int high) {
        return (int) (count(d, high) - count(d, low - 1));
    }

    private long count(int d, int n) {
        long res = 0;
        for (long i = 1; i <= n; i *= 10) {

            long dvid = i * 10;
            // 高位
            long high = n / dvid;
            // 当前位
            long cur = n / i % 10;
            // 低位
            long low = n % i;
            if (cur > d) {
                res += (high + 1) * i;
            } else if (cur < d) {
                res += high * i;
            } else {
                res += high * i + low + 1;
            }
            // 如果d=0会特殊处理，需要减掉当前位数，以为当前位不能以0开头
            if (d == 0) {
                res -= i;
            }
        }
        return res;
    }
}
