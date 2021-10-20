package com.stewart.algorithms.leetbook.初级算法20211016.数组;

/**
 * @author Stewart
 * @create 2021/10/16
 */
public class Solution02 {
    /**
     * 股票
     * 1：
     * p1>p2  不买
     * p1<p2 买
     *
     * 2：
     * p1>p2  卖
     * p1<p2 不卖
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if(i+1<prices.length){
                if (prices[i]<prices[i+1]){
                    result = result+prices[i+1]-prices[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] ={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
