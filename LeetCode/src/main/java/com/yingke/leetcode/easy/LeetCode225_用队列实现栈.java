package com.yingke.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-22
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode225_用队列实现栈 {


    /**
     * 双队列
     */
    class MyStack {
        // 存元素队列
        Queue<Integer> q1 = new LinkedList<>();
        // 辅助队列
        Queue<Integer> q2 = new LinkedList<>();

        /** Initialize your data structure here. */
        public MyStack() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            q2.offer(x);
            // q1全部出队列
            while (!q1.isEmpty()) {
                q2.offer(q1.poll());
            }
            // 交换
            Queue<Integer> t = q1;
            q1 = q2;
            q1 = t;

        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return q1.poll();

        }

        /** Get the top element. */
        public int top() {
            return q1.peek();

        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return q1.isEmpty();
        }
    }


    /**
     * 单队列
     */
    class MyStack1 {
        Queue<Integer> queue = new LinkedList<>();
        /** Initialize your data structure here. */
        public MyStack1() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            int n = queue.size();
            queue.offer(x);
            while (n > 0) {
                queue.offer(queue.poll());
                n--;
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return queue.poll();

        }

        /** Get the top element. */
        public int top() {
            return queue.peek();

        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();

        }
    }

}
