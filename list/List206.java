package list;
/*给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。

输入：head = [1,2,3,4,5]
输出：[5,4,3,2,1]
*/
public class List206 {
    public class ListNode {
        int val;
        List206.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, List206.ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        return prev;

    }
}
