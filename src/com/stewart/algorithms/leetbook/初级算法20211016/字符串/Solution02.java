package com.stewart.algorithms.leetbook.初级算法20211016.字符串;

/**
 * @author Stewart
 * @create 2021/10/19
 */
public class Solution02 {
    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int t = x % 10;
            int newRes = res * 10 + t;
            //如果数字溢出，直接返回0
            if ((newRes - t) / 10 != res) {
                return 0;
            }
            res = newRes;
            x = x / 10;
        }
        return res;

    }
    public static void main(String[] args) {
        reverse(123);
    }
}
