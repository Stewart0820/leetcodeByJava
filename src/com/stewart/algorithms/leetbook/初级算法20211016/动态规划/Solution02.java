package com.stewart.algorithms.leetbook.初级算法20211016.动态规划;

/**
 * @author Stewart
 * @create 2021/10/25
 */
public class Solution02 {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min,prices[i]);
            maxPro = Math.max(prices[i]-min,maxPro);
        }
        return maxPro;
    }
}
