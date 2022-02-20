package com.stewart.algorithms.newstudy.seven;

/**
 * @author Stewart
 * @create 2022/2/20
 * @Description 695. 岛屿的最大面积
 */
public class Solution02 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(dfs(grid, i, j), max);
                }
            }
        }
        return max;
    }

    int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int count = 1;
        count += dfs(grid, i + 1, j);
        count += dfs(grid, i - 1, j);
        count += dfs(grid, i, j + 1);
        count += dfs(grid, i, j - 1);
        return count;
    }
}
