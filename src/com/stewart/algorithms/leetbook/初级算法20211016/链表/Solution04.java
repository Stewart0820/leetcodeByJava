package com.stewart.algorithms.leetbook.初级算法20211016.链表;

/**
 * @author Stewart
 * @create 2021/10/24
 */
public class Solution04 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode node = null;
        if(l1.val<=l2.val){
            node=l1;
            node.next = mergeTwoLists(l1.next,l2);
        }else{
            node=l2;
            node.next = mergeTwoLists(l1,l2.next);
        }
        return node;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }
}
