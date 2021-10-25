package com.stewart.algorithms.leetbook.初级算法20211016.动态规划;

/**
 * @author Stewart
 * @create 2021/10/25
 */
public class Solution01 {
    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
        return dp[n];
    }

    public static void main(String[] args) {
        climbStairs(10);
    }

}
