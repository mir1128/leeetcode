package com.looboo.algorithm.leetcode;

public class Ways1444 {
    public int ways(String[] pizza, int K) {
        int mod = 1000000007;

        int row = pizza.length;
        int col = pizza[0].length();

        int[][] prefix = new int[row + 1][col + 1];
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                int a = pizza[i - 1].charAt(j - 1) == 'A' ? 1 : 0;
                prefix[i][j] = prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1] + a;
            }
        }

        int[][][] dp = new int[row][col][K];
        dp[0][0][1] = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 2; k < K; k++) {
                    for (int l = i + 1; l < row; l++) {
                        if (hasA(prefix, i, j, l - 1, col - 1)
                                && hasA(prefix, l, j, row - 1, col - 1)) {
                            dp[l][j][k] += dp[i][j][k-1];
                            dp[l][j][k] %= mod;
                        }
                    }

                    for (int l = j + 1; l < col; l++) {
                        if (hasA(prefix, i, j, row - 1, l - 1)
                                && hasA(prefix, i, l, row - 1, col - 1)) {
                            dp[i][l][k + 1] += dp[i][j][k];
                            dp[i][l][k + 1] %= mod;
                        }
                    }
                }
            }
        }

        return 0;
    }

    private boolean hasA(int[][] prefix, int r1, int c1, int r2, int c2) {
        int total = prefix[r2 + 1][c2 + 1] - prefix[r1][c2 + 1] - prefix[r2 + 1][c1] + prefix[r1][c1];
        return total > 0;
    }

    public int ways1(String[] pizza, int k) {
        if (pizza == null || pizza.length == 0 || pizza[0] == null || pizza[0].length() == 0 || k <= 0)
            return 0;
        int[][][] map = new int[pizza.length][pizza[0].length()][k];

        //到左边的距离
        int rightest = -1;
        for (int r = pizza.length - 1; r >= 0; r--) {
            for (int c = pizza[0].length() - 1; c >= 0; c--) {
                if (c > rightest) {
                    if (pizza[r].charAt(c) == 'A') {
                        //更新距离
                        rightest = c;
                        map[r][c][0] = 1;
                    } else {
                        map[r][c][0] = 0;
                    }
                } else {
                    map[r][c][0] = 1;
                }
            }
        }
        for (int ki = 1; ki < k; ki++) {
            for(int row = 0; row < pizza.length; row++) {
                for (int col = 0; col < pizza[0].length(); col++) {
                    int ri = row, ci = col;
                    while (ri < pizza.length) {
                        if (pizza[ri].substring(col).indexOf('A') == -1) ri++;
                        else break;
                    }
                    while (ci < pizza[0].length()) {
                        boolean hasA = false;
                        int r = ri;
                        while (r < pizza.length) {
                            if (pizza[r].charAt(ci) == 'A') {
                                hasA = true;
                                break;
                            }
                            r++;
                        }
                        if (hasA) break;
                        else ci++;
                    }
                    int res = 0;
                    for (int i = ri + 1; i < pizza.length; i++) {
                        res = (res + map[i][ci][ki-1]) % 1000000007;
                    }
                    for (int i = ci + 1; i < pizza[0].length(); i++) {
                        res = (res + map[ri][i][ki-1]) % 1000000007;
                    }
                    map[row][col][ki] = res;
                    //发现为最上一层，可以直接返回，此时是第一次ki == k - 1，所以row == 0， col == 0
                    if (ki == k-1) return res;
                }
            }
        }
        return map[0][0][k-1];
    }
}
