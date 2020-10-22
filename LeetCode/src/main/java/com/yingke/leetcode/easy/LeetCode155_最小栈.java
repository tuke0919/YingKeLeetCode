package com.yingke.leetcode.easy;

import java.util.Stack;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-21
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode155_最小栈 {
    /**
     * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
     *
     * push(x) —— 将元素 x 推入栈中。
     * pop() —— 删除栈顶的元素。
     * top() —— 获取栈顶元素。
     * getMin() —— 检索栈中的最小元素。
     *  
     *
     * 示例:
     *
     * 输入：
     * ["MinStack","push","push","push","getMin","pop","top","getMin"]
     * [[],[-2],[0],[-3],[],[],[],[]]
     *
     * 输出：
     * [null,null,null,null,-3,null,0,-2]
     *
     * 解释：
     * MinStack minStack = new MinStack();
     * minStack.push(-2);
     * minStack.push(0);
     * minStack.push(-3);
     * minStack.getMin();   --> 返回 -3.
     * minStack.pop();
     * minStack.top();      --> 返回 0.
     * minStack.getMin();   --> 返回 -2.
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/min-stack
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    class MinStack {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        /** initialize your data structure here. */
        public MinStack() {

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
                if (!s2.isEmpty() && peek == s1.peek() && !s1.contains(peek) ) {
                    s2.pop();
                }
            }
        }

        public int top() {
            return s1.peek();
        }

        public int getMin() {
            if (s2.isEmpty()) {
                return -1;
            } else {
                return s2.peek();
            }
        }
    }
}
