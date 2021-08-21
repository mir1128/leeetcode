package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    public int countPairs(int[] deliciousness) {

        int[] twos = new int[21];
        twos[0] = 1;
        for (int i = 1; i <= 20; i++) {
            twos[i] = twos[i - 1] * 2;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;
        for (int i = 0; i < deliciousness.length; i++) {
            for (int j = 20; j >= 0; j--) {
                if (twos[j] < deliciousness[i]) break;
                if (map.containsKey(twos[j] - deliciousness[i])) {
                    total = (total + map.get(twos[j] - deliciousness[i])) % (1000000007);
                }
            }

            map.compute(deliciousness[i], (k, v) -> v == null ? 1 : v + 1);
        }
        return total;
    }

    public int countPairs1(int[] a) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            cnt.compute(a[i], (k, v) -> v == null ? 1 : v + 1);
        }
        long ret = 0;

        for (Integer k : cnt.keySet()) {
            for (int x = 1; x <= (1 << 21); x *= 2) {
                int nk = x - k;
                if (nk < k) continue;
                if (cnt.containsKey(nk)) {
                    if (nk != k) {
                        ret += (long)cnt.get(nk) * (long)cnt.get(k) % (1000000007);
                    } else {
                        ret += ((long)cnt.get(k) * (long) (cnt.get(k) - 1)) / 2 % (1000000007);
                    }
                }
            }
        }
        return (int) ret;
    }
}
