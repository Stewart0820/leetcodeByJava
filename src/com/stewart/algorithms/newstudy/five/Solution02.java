package com.stewart.algorithms.newstudy.five;

/**
 * @author Stewart
 * @create 2022/2/17
 * @Description
 */
public class Solution02 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        //获取传入链表的长度
        int len = 0;
        while (head!=null){
            head = head.next;
            len++;
        }
        int last = len-n;
        //如果last等于头节点，删除的就是头节点
        if(last==0){
            return pre.next;
        }
        for (int i = 0; i < last-1; i++) {
            pre = pre.next;
        }
        return head;

    }
}
