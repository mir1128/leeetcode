package com.looboo.algorithm.lib;

public class GCD {
    public int euclid(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return euclid(q, r);
    }

    public static void main(String[] args) {
        System.out.println(new GCD().euclid(Math.max(1111111, 1234567), Math.min(1111111, 1234567)));
    }
}
