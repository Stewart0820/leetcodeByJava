package com.stewart.algorithms.newstudy.seven;

import com.stewart.algorithms.newstudy.one.Solution;

/**
 * @author Stewart
 * @create 2022/2/20
 * @Description  733. 图像渲染
 */
public class Solution01 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        DFS(image, sr, sc, newColor, oldColor);
        return image;
    }

    public void DFS(int[][] image, int x, int y, int newColor, int oldColor) {
        //判断是否超出了范围
        if (x < 0 || x >= image.length || y < 0 || y >= image[0].length) {
            return;
        }
        //如果是原本的颜色和已经修改完之后的颜色，直接返回
        if (image[x][y] != oldColor || image[x][y] == newColor) {
            return;
        }
        image[x][y] = newColor;
        DFS(image, x - 1, y, newColor, oldColor);
        DFS(image, x + 1, y, newColor, oldColor);
        DFS(image, x, y - 1, newColor, oldColor);
        DFS(image, x, y + 1, newColor, oldColor);
    }

}
