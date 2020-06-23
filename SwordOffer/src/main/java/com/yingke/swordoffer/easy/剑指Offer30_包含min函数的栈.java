package com.yingke.swordoffer.easy;

import java.util.Stack;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-23
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer30_包含min函数的栈 {

    /**
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
     *
     *  
     *
     * 示例:
     *
     * MinStack minStack = new MinStack();
     * minStack.push(-2);
     * minStack.push(0);
     * minStack.push(-3);
     * minStack.min();   --> 返回 -3.
     * minStack.pop();
     * minStack.top();      --> 返回 0.
     * minStack.min();   --> 返回 -2.
     *  
     *
     * 提示：
     *
     * 各函数的调用总次数不超过 20000 次
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


    class MinStack {
        Stack<Integer> s1;
        Stack<Integer> s2;

        /** initialize your data structure here. */
        public MinStack() {
            s1 = new Stack<>();
            s2 = new Stack<>();

        }

        public void push(int x) {
            if (s2.isEmpty()) {
                s2.push(x);
            } else {
                if (x < s2.peek()) {
                    s2.push(x);
                }
            }
            s1.push(x);
        }

        public void pop() {
            if (!s1.isEmpty()) {
                int peek = s1.pop();
                if (!s2.isEmpty() && peek == s2.peek() && !s1.contains(peek)) {
                    s2.pop();
                }
            }
        }

        public int top() {
            return s1.peek();
        }

        public int min() {
            if (s2.isEmpty()) {
                return -1;
            } else {
                return s2.peek();
            }
        }
    }



}
