package leetCoodDay01;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 */
public class leetCode021 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pre = new ListNode();
        ListNode res = pre;
        while(list1 != null && list2 != null) {
            if (list1.val<list2.val){
                res.next = list1;
                list1 = list1.next;
            }
            if (list2.val<list1.val){
                res.next = list2;
                list2 = list2.next;
            }
            res= res.next;
        }
        if (list1 ==null){
            res.next = list2;
        }
        if (list2 ==null){
            res.next = list1;
        }
        return pre.next;
    }
}
