package com.xk.leetcode_learn.leetcode.leetcode.editor.cn;//Write code to remove duplicates from an unsorted linked list.

import java.util.HashSet;
import java.util.Set;

/**
 * 移除重复节点
 */
public class 去除重复节点 {
    public static ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null) return head;
        Set<Integer> set = new HashSet<>();
        ListNode temp = head, prev = head;
        while (temp != null) {
            if (set.contains(temp.val)) {
                prev.next = temp.next;
            } else {
                prev = temp;
            }
            set.add(temp.val);
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        listNode.next = listNode1;
        ListNode listNode2 = new ListNode(3);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(2);
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode(1);
        listNode3.next = listNode4;
        ListNode listNode5 = new ListNode(4);
        listNode4.next = listNode5;
        ListNode listNode6 = new ListNode(5);
        listNode5.next = listNode6;
        ListNode listNode7 = new ListNode(1);
        listNode6.next = listNode7;
        去除重复节点.removeDuplicateNodes(listNode);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
