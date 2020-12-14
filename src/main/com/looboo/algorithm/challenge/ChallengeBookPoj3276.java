package com.looboo.algorithm.challenge;

import java.util.Arrays;

public class ChallengeBookPoj3276 {
    private int MAX_N;
    private int N;
    private int[] dir;
    private int[] f;

    public ChallengeBookPoj3276(int MAX_N, int[] dir) {
        this.MAX_N = MAX_N;
        this.dir = dir;
        f = new int[MAX_N];
    }

    private void solve() {
        int K = 1, M = N;
        for (int k = 1; k <= N; k++) {
            int m = calc(k);

            if (m > 0 && M > m) {
                M = m;
                K = k;
            }
        }
        System.out.println(String.format("m = %s, k = %s", M, K));
    }

    private int calc(int k) {
        Arrays.fill(f, 0);

        int res = 0;
        int sum = 0;

        for (int i = 0; i + k < N; i++) {
            if ((dir[i] + sum) % 2 != 0) {
                res++;
                f[i] = 1;
            }

            sum += f[i];
            if (i - k + 1 >= 0) {
                sum -= f[i - k + 1];
            }
        }

        for (int i = N - k + 1; i < N; i++) {
            if ((dir[i] + sum) % 2 != 0) {
                return -1;
            }
            if (i - k + 1 >= 0) {
                sum -= f[i - k + 1];
            }
        }
        return res;
    }
}
