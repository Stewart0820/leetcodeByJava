package com.stewart.algorithms.leetbook.初级算法20211016.字符串;

/**
 * @author Stewart
 * @create 2021/10/20
 */
public class Solution06 {
    public static int myAtoi(String s) {
        s = s.trim();
        System.out.println(s);
        int flag = 0;
        if(s.charAt(0)=='-'){
            flag = 1;
        }else{
            if(s.charAt(0)<48||s.charAt(0)>57){
                return 0;
            }
        }
        int res = 0;
        s = s.replaceAll("[^0-9]", "").toLowerCase();
        try {
            int i = Integer.parseInt(s);
            res = i;
        }catch(Exception NumberFormatException){
            if(flag==1){
                res = -2147483648;
            }else{
                res = 2147483647;
            }
        }
        if(flag==1){
            res=res*-1;
        }
        System.out.println(res);

        return res;
    }
    public static void main(String[] args) {
        myAtoi("   -42");
    }
}
