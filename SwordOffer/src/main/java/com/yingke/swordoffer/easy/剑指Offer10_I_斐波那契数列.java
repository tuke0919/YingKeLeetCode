package com.yingke.swordoffer.easy;

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
public class 剑指Offer10_I_斐波那契数列 {

    /**
     * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
     *
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
     *
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：n = 2
     * 输出：1
     * 示例 2：
     *
     * 输入：n = 5
     * 输出：5
     *  
     *
     * 提示：
     *
     * 0 <= n <= 100
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param n
     * @return
     */

    public int fib(int n) {
        if (n == 0 ||n == 1) {
            return n;
        }

        int f0 = 0;
        int f1 = 1;
        int f2 = 0;

        for (int i = 2; i <= n; i ++) {
             f2 = f0 + f1;
             f2 %= 1000000007;
             f0 = f1;
             f1 = f2;
        }

        return f2;
    }
}
