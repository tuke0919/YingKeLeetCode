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
public class LeetCode69_X的平方根 {

    /**
     * 牛顿迭代法
     */
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double C = x;
        double x0 = x;
        double xi;
        while (true) {
            xi = 0.5 * (x0 + C / x0);
            if (Math.abs(xi - x0) < 1e-7) {
                break;
            }
            x0 = xi;
        }
        return (int) x0;
    }
}
