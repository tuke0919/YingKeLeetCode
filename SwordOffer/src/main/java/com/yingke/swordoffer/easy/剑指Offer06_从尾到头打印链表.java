package com.yingke.swordoffer.easy;

import java.util.Stack;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-22
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer06_从尾到头打印链表 {


    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }

    /**
     * 先数量，在遍历
     *
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            ++ count;
            node = node.next;
        }

        int[] result = new int[count];
        node = head;
        for (int i = count -1; i >= 0; i --) {
            result[i] = node.val;
            node = node.next;
        }

        return result;
    }

    /**
     * 【Java】【栈】
     * 时间：O(N)
     * 空间：O(N)
     * @param head
     * @return
     */
    public int[] reversePrintStack(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }

        int[] nums = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            nums[index] = stack.pop();
            index ++;
        }
        return nums;
    }



}
