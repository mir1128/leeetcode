package com.looboo.algorithm.leetcode;

public class LargestTriangleArea812 {
    public double largestTriangleArea(int[][] points) {
        double res = 0;
        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    int x1 = points[i][0];
                    int y1 = points[i][1];

                    int x2 = points[j][0];
                    int y2 = points[j][1];

                    int x3 = points[k][0];
                    int y3 = points[k][1];

                    double s = 0.5 * Math.abs(x1 * y2 - x1 * y3 + x2 * y3 - x2 * y1 + x3 * y1 - x3 * y2);
                    res = Math.max(s, res);
                }
            }
        }
        return res;
    }


}
