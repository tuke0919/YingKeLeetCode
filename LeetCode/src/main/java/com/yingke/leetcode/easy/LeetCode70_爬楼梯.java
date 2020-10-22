package com.yingke.leetcode.easy;

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
public class LeetCode70_爬楼梯 {

    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     *
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     *
     * 注意：给定 n 是一个正整数。
     *
     * 示例 1：
     *
     * 输入： 2
     * 输出： 2
     * 解释： 有两种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶
     * 2.  2 阶
     * 示例 2：
     *
     * 输入： 3
     * 输出： 3
     * 解释： 有三种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶 + 1 阶
     * 2.  1 阶 + 2 阶
     * 3.  2 阶 + 1 阶
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/climbing-stairs
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 递归超时
     * @param n
     * @return
     */
    public int climbStairs(int n) {
//        if (n == 0 || n == 1 || n == 2) {
//            return n;
//        }
//
//        return climbStairs(n - 1) + climbStairs(n - 2);

        if (n <= 2) {
            return n;
        }

        int f1 = 1;
        int f2 = 2;

        for (int i = 3; i <= n; i++) {
            int temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        }
        return f2;

    }


}
