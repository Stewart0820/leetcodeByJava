package com.stewart.algorithms.leetbook.初级算法20211016.字符串;

import java.util.HashMap;

/**
 * @author Stewart
 * @create 2021/10/20
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 */
public class Solution03 {
    public static int firstUniqChar(String s) {
        //方式1：时间超时
//        int res = -1;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            int flag = 0;
//            for (int j = 0; j < s.length(); j++) {
//                if(c==s.charAt(j)){
//                    flag=flag+1;
//                }
//            }
//            if(flag==1){
//                res =  i;
//                break;
//            }
//        }
//        System.out.println(res);
//        return res;
        
        //方法2
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        //然后在遍历字符串s中的字符，如果出现次数是1就直接返回
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        firstUniqChar("aabb");
    }
}
