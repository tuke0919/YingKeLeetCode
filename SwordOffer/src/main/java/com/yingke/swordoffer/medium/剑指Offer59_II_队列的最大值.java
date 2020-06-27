package com.yingke.swordoffer.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-26
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer59_II_队列的最大值 {

    /**
     *
     * 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
     *
     * 若队列为空，pop_front 和 max_value 需要返回 -1
     *
     * 示例 1：
     *
     * 输入:
     * ["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
     * [[],[1],[2],[],[],[]]
     * 输出: [null,null,null,2,1,2]
     * 示例 2：
     *
     * 输入:
     * ["MaxQueue","pop_front","max_value"]
     * [[],[],[]]
     * 输出: [null,-1,-1]
     *  
     *
     * 限制：
     *
     * 1 <= push_back,pop_front,max_value的总操作数 <= 10000
     * 1 <= value <= 10^5
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     */


    /**
     * 维护单调队列：
     * 每个值都是当前 队列的最大值
     */
    class MaxQueue {
        Deque<Integer> deque;
        Deque<Integer> maxDeque;

        public MaxQueue() {
            deque = new LinkedList<>();
            maxDeque = new LinkedList<>();
        }

        public int max_value() {
            if (maxDeque.isEmpty()) {
                return -1;
            }
            return maxDeque.peekFirst();
        }

        public void push_back(int value) {
            if (maxDeque.isEmpty()) {
                maxDeque.addLast(value);
            } else {
                // 保持 单调队列单调
                while (!maxDeque.isEmpty() && value > maxDeque.peekLast()) {
                    maxDeque.removeLast();
                }
                maxDeque.addLast(value);

            }
            deque.add(value);
        }

        public int pop_front() {
            if (deque.isEmpty()) {
                return -1;
            }
            int pop = deque.poll();
            // 出队列数据 等于 单调队列首值，说明出队列的是 当前队列的最大值
            if (!maxDeque.isEmpty() && pop == maxDeque.peekFirst()) {
                maxDeque.removeFirst();
            }
            return pop;
        }
    }




}
