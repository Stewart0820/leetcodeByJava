package com.stewart.algorithms.leetbook.初级算法20211016.排序和搜索;

/**
 * @author Stewart
 * @create 2021/10/25
 */
public class Solution02  {
    public int firstBadVersion(int n) {
        // n = 6;
        /*
            1+(6-1)/2 = 3
         */
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            //不是版本错误，所以中位数+1
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;

    }

    private boolean isBadVersion(int mid) {
        return true;
    }


}
