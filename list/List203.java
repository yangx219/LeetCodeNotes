package list;

/**
 * 给你一个链表的头节点 head 和一个整数 val ，
 * 请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 *
 */

/*
* [dummy]                           [cur]
  ↓                                ↓
+-----+    +-----+    +-----+    +-----+    +-----+
|  0  | -> |  6  | -> |  2  | -> |  3  | -> |  4  |
+-----+    +-----+    +-----+    +-----+    +-----+

cur.next.val == 6 ⇒ cur.next = cur.next.next

         ↓
+-----+    +-----+    +-----+    +-----+
|  0  | -> |  2  | -> |  3  | -> |  4  |
+-----+    +-----+    +-----+    +-----+

最后 return dummy.next 👉 得到干净的新链表 2 → 3 → 4*/

public class List203 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode cur = dummy;
            while(cur.next!= null){
                if(cur.next.val == val){
                    cur.next = cur.next.next;
                }else{
                    cur = cur.next;

                }

            }
            return dummy.next;

        }
    }
}
