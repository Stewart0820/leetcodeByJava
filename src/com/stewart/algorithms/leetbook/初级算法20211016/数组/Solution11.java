package com.stewart.algorithms.leetbook.初级算法20211016.数组;

/**
 * @author Stewart
 * @create 2021/10/18
 */
public class Solution11 {
    public static void rotate(int[][] matrix) {
        int[][] ints = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                ints[j][ints.length-i-1]= matrix[i][j];
            }
        }
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                matrix[i][j] = ints[i][j];
            }
        }

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        rotate(arr);
    }
}
