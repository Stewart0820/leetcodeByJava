package com.stewart.algorithms.leetbook.初级算法20211016.树;

import javax.swing.tree.TreeNode;

/**
 * @author Stewart
 * @create 2021/10/24
 */
public class Solution01 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }else {
            int i = maxDepth(root.left);
            int j = maxDepth(root.right);
            return 1 + Math.max(i, j);
        }
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
    public static void main(String[] args) {
        int num[] = {4,2,1,3,5,7,6,8};
        // 添加父节点
        TreeNode first = new TreeNode(num[0], null, null);

        for(int i=1; i<num.length ; i++) {
            TreeNode next = new TreeNode(num[i], null, null);
            add(next,first);
        }

        System.out.println(first);
    }

    public static void add(TreeNode next,TreeNode node) {
        if(next.val >= node.val) {
            if(node.right == null) {
                node.right = next;
            }else {
                add(next,node.right);
            }
        }else {
            if(node.left == null) {
                node.left = next;
            }else {
                add(next,node.left);
            }
        }
    }

}