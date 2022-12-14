package leetCoodDay01;

import java.util.List;

/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 *
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 */
public class leetCode024 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode zeroHead = new ListNode(0);
        zeroHead.next = head;
        ListNode temp;
        temp = zeroHead;
        while(temp.next!=null && temp.next.next!=null){
            ListNode node1 = temp.next;
            ListNode node2 = node1.next;
            temp.next = node2;
            node1.next =node2.next;
            node2.next = node1;
            temp = node1;
        }
        return zeroHead.next;

    }

}
