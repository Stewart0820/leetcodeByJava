package com.stewart.algorithms.leetbook.初级算法20211016.树;

/**
 * @author Stewart
 * @create 2021/10/25
 */
public class Solution02 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long minValue, long maxValue) {
        if(root==null){
            return true;
        }
        if(root.val >= maxValue  || root.val <= minValue){
            return false;
        }

        return isValidBST(root.left,minValue,root.val) && isValidBST(root.right,root.val,maxValue);
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
