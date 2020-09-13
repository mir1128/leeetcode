package com.looboo.algorithm.leetcode;

public class Exist79 {


    private boolean[][] visited;
    private int direction[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int ROW;
    private int COL;

    public boolean exist(char[][] board, String word) {
        ROW = board.length;
        COL = board[0].length;
        if (ROW * COL < word.length()) return false;

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                visited = new boolean[ROW][COL];
                if (wordSearch(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean wordSearch(char[][] board, String word, int row, int col, int index) {
        if (index == word.length() - 1) {
            return board[row][col] == word.charAt(index);
        }

        if (board[row][col] == word.charAt(index)) {
            visited[row][col] = true;
            for (int i = 0; i < 4; i++) {
                int nRow = row + direction[i][0];
                int nCol = col + direction[i][1];

                if (inArea(nRow, nCol) && !visited[nRow][nCol]) {
                    if (wordSearch(board, word, nRow, nCol, index + 1)) {
                        return true;
                    }
                }
            }
            visited[row][col] = false;
        }
        return false;
    }

    private boolean inArea(int row, int col) {
        return 0 <= row && row < ROW && 0 <= col && col < COL;
    }

    public static void main(String[] args) {
        char arr[][] = {{'a'}};
        System.out.println(new Exist79().exist(arr, "a"));
    }
}
