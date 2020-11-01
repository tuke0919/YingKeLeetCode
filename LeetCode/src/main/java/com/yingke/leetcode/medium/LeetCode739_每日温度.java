package com.yingke.leetcode.medium;

import java.util.Stack;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-11-01
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode739_每日温度 {
    /**
     * 请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
     *
     * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
     *
     * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/daily-temperatures
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 解法1：双重循环
     * 解法2：使用栈
     *
     * 维护递减栈，后入栈的元素总比栈顶元素小。
     *
     * 比对当前元素与栈顶元素的大小
     * 若当前元素 < 栈顶元素：入栈
     * 若当前元素 > 栈顶元素：弹出栈顶元素，记录两者下标差值即为所求天数
     * 这里用栈记录的是 T 的下标。
     *
     *
     * @param T
     * @return
     */
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[T.length];
        for (int i = 0; i < T.length; i++) {

            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int tmp = stack.pop();
                ans[tmp] = i - tmp;
            }
            stack.push(i);
        }

        return ans;
    }
}
