package com.boris.leet;

import com.boris.leet.util.ListNode;

public class Solution19 {
    /**
     * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
     */
    public static void main(String[] args) {
        int[] l1 = {1, 2, 3, 4, 5};
        int n = 2;
        ListNode list1 = new ListNode().addListNode(l1);
        ListNode list2 = new Solution19().removeNthFromEnd2(list1, n);
        list2.showNodeList();
    }

    /**
     * 方法一：暴力法，先查找列表长度L，再删除从列头开始的第（L-n+1）的节点
     * 注意：有可能删除表的是头节点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;
        int length = getLength(head);
        for (int i = 1; i < length - n + 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }

    int getLength(ListNode head) {
        int l = 0;
        while (head != null) {
            ++l;
            head = head.next;
        }
        return l;
    }

    /**
     * 方法二：快慢指针，返回头指针
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode first = head;
        ListNode second = dummy;
        // 快指针前进n步
        while(n>0) {
            first = first.next;
            --n;
        }
        // 快慢指针一起前进，直到first为null
        while(first!=null) {
            second = second.next;
            first = first.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
