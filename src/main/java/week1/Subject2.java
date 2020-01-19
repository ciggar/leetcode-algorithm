package week1;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @Date 2019-01-20
 */

/**
 * 递归思想来做
 */
public class Subject2 {

    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = getList(l1);
        List<Integer> list2 = getList(l2);
        if (list1.size() <= list2.size()){
            for (int i = 0; i < list1.size(); i++) {
                Integer num1 = list1.get(i);
            }
        }else {

        }

    }

    private List<Integer> getList(ListNode listNode) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        list.add(listNode.val,i);
        while (listNode.next != null){
            i++;
            listNode = listNode.next;
            list.add(listNode.val,i);
        }
        return list;
    }*/
//    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//    输出：7 -> 0 -> 8
//    原因：342 + 465 = 807

    /**
     * 递归算法
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2,0);
    }

    private ListNode add(ListNode l1, ListNode l2, int i) {
        if (l1 == null && l2 == null && i == 0) {
            return null;
        }
        if (l1 == null) {
            l1 = new ListNode(0);
        }
        if (l2 == null){
            l2 = new ListNode(0);
        }
        int value = l1.val + l2.val;
        ListNode result = new ListNode(value%10);
        result.next = add(l1.next,l2.next,value/10);
        return result;
    }


}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
