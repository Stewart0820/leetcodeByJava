package com.stewart.algorithms.leetbook.初级算法20211016.字符串;

/**
 * @author Stewart
 * @create 2021/10/21
 * 实现 strStr()
 */
public class Solution07 {

    public static int strStr(String haystack, String needle) {
        int res = -1;
        if(haystack.equals("")&&needle.equals("")){
            return 0;
        }else if(haystack.equals("")){
            return -1;
        }else if(needle.equals("")){
            return 0;
        }


        char[] haystackC = haystack.toCharArray();
        char[] needleN = needle.toCharArray();
        int flag=0;
        for (int i = 0; i < haystackC.length; i++) {
            if (haystackC[i]==needleN[0]){
                flag=i;
                for (int j = 0; j < needleN.length; j++) {
                    if (flag>=haystackC.length){
                        return -1;
                    }
                    if (haystackC[flag]!=needleN[j]){
                        break;
                    }
                    flag++;
                }
            }
            if(flag-i==needleN.length){
                return i;
            }
        }
        return res;

        //java的string的api
//      return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        strStr("","");
    }
}
