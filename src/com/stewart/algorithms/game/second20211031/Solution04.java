package com.stewart.algorithms.game.second20211031;

import java.util.ArrayList;

/**
 * @author Stewart
 * @create 2021/10/31
 */
public class Solution04 {
    public static boolean possiblyEquals(String s1, String s2) {
        char[] one = s1.toCharArray();
        char[] two = s2.toCharArray();
        int flagOne = 0;
        int flagTwo = 0;
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();
//        for (int i = 0; i < one.length; i++) {
//            boolean digit = Character.isDigit(one[i]);
//            if(digit==true){
//                flagOne++;
//            }
//        }
        for (int i = 0; i < two.length; i++) {
            boolean digit = Character.isDigit(two[i]);
            if(digit!=true){
                flagTwo++;
            }else{
                listTwo.add(two[i]+"");
                System.out.println(two[i]);
            }
        }
        for (int i = 0; i < listTwo.size(); i++) {
            Integer.parseInt(listTwo.get(i));
        }
        System.out.println(listTwo);
        return false;
    }

    public static void main(String[] args) {
        possiblyEquals("internationalization","i18n");
    }
}
