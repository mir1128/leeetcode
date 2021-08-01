package com.looboo.algorithm.algo4;

public class Session1_1_20 {
    public double ln(int n) {
        if (n == 1)
            return 0;
        return ln(n - 1) + Math.log(n);
    }
}
