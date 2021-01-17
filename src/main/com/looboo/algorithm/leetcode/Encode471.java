package com.looboo.algorithm.leetcode;

public class Encode471 {
    String[][] dp;
    public String encode(String s){
        int n = s.length();
        dp = new String[n][n];

        for(int len = 1; len <= n; len++){
            for(int i = 0; i + len - 1 < n; i++){
                int j = i + len - 1;
                dp[i][j] = lc459(s, i, j);
                if(len > 4){
                    for(int k = i; k < j; k++){
                        String split = dp[i][k] + dp[k + 1][j];
                        if(dp[i][j].length() > split.length()) dp[i][j] = split;
                    }
                }
            }
        }
        return dp[0][n - 1];
    }

    public String lc459(String s, int i, int j){
        s = s.substring(i, j + 1);
        if(s.length() < 5)  return s;
        int p = (s + s).indexOf(s, 1);
        if(p != s.length()){
            int cnt = s.length() / p;
            return cnt + "[" + dp[i][i + p - 1] + "]";
        }
        return s;
    }
}
