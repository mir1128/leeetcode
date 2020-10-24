package com.looboo.algorithm.leetcode;

import java.util.List;

public class TotalNQueens52 {
    public int totalNQueens(int n) {



        return 0;
    }

    private boolean fit(List<Pair> pairs, int row, int col) {
        for (int i = 0; i < pairs.size(); i++) {
            if (!fit(pairs.get(i).row, pairs.get(i).col, row, col)) {
                return false;
            }
        }
        return true;
    }

    private boolean fit(int row1, int col1, int row2, int col2) {
        if ((row1 == row2) || (col1 == col2)) return false;

        if (row1 - row2 == col1 - col2) return false;

        return true;
    }

    public static class Pair {
        public int row;
        public int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
