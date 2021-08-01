package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CountSubIslands {

    boolean[][] visited;

    public int countSubIslands(int[][] grid1, int[][] grid2) {

        List<List<Integer>> island1 = islands(grid1);
        List<List<Integer>> island2 = islands(grid2);

        int m = grid1.length;
        int n = grid1[0].length;

        int [][] unionFord = new int[m][n];

        int index = 1;
        for (int i = 0; i < island1.size(); i++) {
            for (int val : island1.get(i)) {
                unionFord[val / n][val % n] = index;
            }
            index++;
        }

        int count = 0;
        for (int i = 0; i < island2.size(); i++) {
            List<Integer> set = island2.get(i);

            int setIndex = -1;
            int j = 0;
            for (; j < set.size(); j++) {
                int val = set.get(j);
                if (unionFord[val / n][val % n] == 0) break;

                if (setIndex == -1) {
                    setIndex = unionFord[val / n][val % n];
                } else {
                    if (unionFord[val / n][val % n] != setIndex)
                        break;
                }
            }

            if (j == set.size()) {
                count++;
            }
        }
        return count;
    }

    private List<List<Integer>> islands(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        visited = new boolean[m][n];

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    List<Integer> set = new ArrayList<>();
                    set.add(i * n + j);
                    dfs(grid, i, j, set);
                    result.add(set);
                }
            }
        }
        return result;
    }

    private void dfs(int[][] grid, int i, int j, List<Integer> result) {
        int m = grid.length;
        int n = grid[0].length;

        if (i - 1 >= 0 && !visited[i - 1][j] && grid[i - 1][j] == 1) {
            visited[i - 1][j] = true;
            result.add((i - 1) * n + j);

            dfs(grid, i - 1, j, result);
        }

        if (j - 1 >= 0 && !visited[i][j - 1] && grid[i][j - 1] == 1) {
            visited[i][j - 1] = true;
            result.add(i * n + j - 1);

            dfs(grid, i, j - 1, result);
        }
        if (i + 1 < m && !visited[i + 1][j] && grid[i + 1][j] == 1) {
            visited[i + 1][j] = true;
            result.add((i + 1) * n + j);

            dfs(grid, i + 1, j, result);
        }
        if (j + 1 < n && !visited[i][j + 1] && grid[i][j + 1] == 1) {
            visited[i][j + 1] = true;
            result.add(i * n + j + 1);

            dfs(grid, i, j + 1, result);
        }
    }
}
