package com.boris.leet;

import com.boris.leet.util.ListNode;

public class Solution21 {
    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。
     * 新链表是通过拼接给定的两个链表的所有节点组成的。
     */

    public static void main(String[] args) {
        int[] l1 = {1, 2, 4};
        int[] l2 = {1, 3, 4};

        ListNode list1 = new ListNode().addListNode(l1);
        ListNode list2 = new ListNode().addListNode(l2);

        ListNode list3 = new Solution21().mergeTwoLists(list1, list2);
        list3.showNodeList();
    }

    /**
     * 方法一：迭代
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                prev.next = list2;
                list2 = list2.next;
            } else {
                prev.next = list1;
                list1 = list1.next;
            }
            prev = prev.next;
        }
        // 合并后 list1 和 list2 最多只有一个还未被合并完
        if (list1 == null) {
            prev.next = list2;
        } else {
            prev.next = list1;
        }
        return preHead.next;
    }

    /**
     * 方法二：递归
     */
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
