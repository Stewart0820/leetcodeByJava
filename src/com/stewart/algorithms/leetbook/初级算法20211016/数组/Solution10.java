package com.stewart.algorithms.leetbook.初级算法20211016.数组;


import java.util.HashSet;

/**
 * @author Stewart
 * @create 2021/10/18
 */
public class Solution10 {
    private static boolean isValidSudoku(String[][] board) {

        for(int i = 0;i < 9;i++){
            HashSet setLine = new HashSet();
            HashSet setCol = new HashSet();
            HashSet setBox = new HashSet();
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != "." &&!setLine.add(board[i][j])){
                    return false;
                }
                if(board[j][i] != "." && !setCol.add(board[j][i])){
                    return false;
                }
                int a = (i/3)*3 + j/3;
                int b = (i%3)*3 + j%3;
                if(board[a][b] != "." && !setBox.add(board[a][b])){
                    return false;
                }
            }
        }
        return true;



    }

    //    private static boolean isValid(Set set,String ch){
//
//
//        return false;
//    }
    public static void main(String[] args) {
        String[][] arr = {{"5", "3", ".", ".", "7", ".", ".", ".", "."}
                , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
                , {".", "9", "8", ".", ".", ".", ".", "6", "."}
                , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
                , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
                , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
                , {".", "6", ".", ".", ".", ".", "2", "8", "."}
                , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
                , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};

        isValidSudoku(arr);
    }

}
