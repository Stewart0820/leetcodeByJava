package com.stewart.algorithms.newstudy.seven;

/**
 * @author Stewart
 * @create 2022/2/20
 * @Description  深度优先算法
 *              解题思路：首先判断是否超出范围，符合规矩，
 *              然后通过上下左右进行递归
 */
public class Solution03 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(DFS(grid, i, j), max);
                }
            }
        }
        return max;
    }


    int DFS(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        //设置为0，防止重复
        grid[i][j] = 0;
        int count = 1;
        count += DFS(grid, i + 1, j);
        count += DFS(grid, i - 1, j);
        count += DFS(grid, i, j + 1);
        count += DFS(grid, i, j - 1);
        return count;
    }
}
