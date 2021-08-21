package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NumMatrix308 {
    private int[][] sum;
    private int[][] matrix;

    private Map<Point, Integer> updateMap = new HashMap<>();

    public NumMatrix308(int[][] matrix) {

        this.matrix = matrix;

        int row = matrix.length;
        if (row == 0) return;

        int col = matrix[0].length;
        if (col == 0) return;
        sum = new int[row][col];

        for (int i = 0; i < row; i++) {
            int total = 0;
            for (int j = 0; j < col; j++) {
                if (i == 0) {
                    total += matrix[i][j];
                    sum[i][j] = total;
                } else {
                    total += matrix[i][j];
                    sum[i][j] = sum[i - 1][j] + total;
                }
            }
        }
    }

    public void update(int row, int col, int val) {
        updateMap.put(new Point(row, col), val - matrix[row][col]);
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (sum == null) return 0;

        int originValue = sum[row2][col2] + (row1 > 0 && col1 > 0 ? sum[row1 - 1][col1 - 1] : 0)
                - (row1 > 0 ? sum[row1 - 1][col2] : 0)
                - (col1
                > 0 ? sum[row2][col1 - 1] : 0);

        int delta = updateMap.entrySet().stream()
                .filter(e -> inRange(e.getKey().row, e.getKey().col, row1, col1, row2, col2))
                .map(e -> e.getValue()).mapToInt(i -> i).sum();

        return originValue + delta;
    }

    private boolean inRange(int row, int col, int row1, int col1, int row2, int col2) {
        return row1 <= row && row <= row2 && col1 <= col && col <= col2;
    }

    static class Point {
        public int row;
        public int col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return row == point.row &&
                    col == point.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }
    }
}
