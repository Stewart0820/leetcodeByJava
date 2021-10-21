package com.stewart.algorithms.leetbook.初级算法20211016.字符串;

/**
 * @author Stewart
 * @create 2021/10/21
 */
public class Solution09 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        System.out.println("??");
        String s = strs[0];
        int flag = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            String s1 = String.valueOf(c);
            for (int k = 1; k < strs.length;k++){
                if(strs[k].indexOf(s1)==-1){
                    break;
                }
                flag++;
            }
        }
        String res = "";
        for (int i = 0; i < (flag-1)/strs.length-1; i++) {
            System.out.println(s.charAt(i));
             res = res+s.charAt(i)+"";
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }
}
