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
public class 剑指Offer10_II_青蛙跳台阶问题 {

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
     *
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     *
     * 示例 1：
     *
     * 输入：n = 2
     * 输出：2
     * 示例 2：
     *
     * 输入：n = 7
     * 输出：21
     * 提示：
     *
     * 0 <= n <= 100
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * f(n) = f(n - 1) + f(n - 2)
     * @param n
     * @return
     */
    public int numWays(int n) {

        if (n == 0 ||n == 1) {
            return 1;
        }
        // n = 0 为啥是1 ？
        int f0 = 1;
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
