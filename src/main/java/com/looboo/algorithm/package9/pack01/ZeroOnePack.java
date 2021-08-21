package com.looboo.algorithm.package9.pack01;

public class ZeroOnePack {
    public int zeroOnePack(int V, int[][] items) {
        int n = items.length;
        int[] f = new int[V + 1];
        for (int i = 0; i < n; i++) {
            for (int j = V; j >= items[i][0]; j--) {
                f[j] = Math.max(f[j], f[j - items[i][0]] + items[i][1]);
            }
        }
        return f[V];
    }
}
