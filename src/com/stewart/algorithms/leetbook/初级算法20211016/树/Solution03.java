package com.stewart.algorithms.leetbook.初级算法20211016.树;

/**
 * @author Stewart
 * @create 2021/10/25
 * 对称二叉树
 */
public class Solution03 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        //从两个子节点开始判断
        return isSymmetricHelper(root.left, root.right);
    }

    private boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        //如果左右子节点都为空，说明当前节点是叶子节点，返回true
        if (left == null && right == null) {
            return true;
        }
        //如果当前节点只有一个子节点或者有两个子节点，但两个子节点的值不相同，直接返回false
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        //然后左子节点的左子节点和右子节点的右子节点比较，左子节点的右子节点和右子节点的左子节点比较
        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }
}
