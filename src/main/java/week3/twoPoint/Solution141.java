package week3.twoPoint;

/**
 * @author: jia.xue
 * @create: 2020-03-18 21:06
 * @Description
 *
 * 给定一个链表，判断链表中是否有环。
 *
 * 为了表示给定链表中的环，
 * 我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 **/


import java.util.List;

/**
 * 解析 ：
 *  用快慢指针 若指针相遇则判断有环
 */
public class Solution141 {

    public boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode node1 = head;
        ListNode node2 = head.next;

        while (node1 != null && node2 != null && node2.next != null) {
            if (node1 == node2) {
                return true;
            }
            node1 = node1.next;
            node2 = node2.next.next;
        }

        return false;

    }


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
        }
    }
}