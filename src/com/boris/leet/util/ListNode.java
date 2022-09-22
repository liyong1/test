package com.boris.leet.util;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void showNodeList() {
        ListNode temp = this;
        while(temp!=null) {
            System.out.print(temp.val);
            System.out.print(',');
            temp = temp.next;
        }
    }

    public ListNode addListNode(int[] ll) {
        ListNode head1 = new ListNode(-1);
        ListNode prev1 = head1;
        for (int i = 0; i < ll.length; i++) {
            ListNode p1 = new ListNode(ll[i]);
            prev1.next = p1;
            prev1 = p1;
        }
        return head1.next;
    }
}
