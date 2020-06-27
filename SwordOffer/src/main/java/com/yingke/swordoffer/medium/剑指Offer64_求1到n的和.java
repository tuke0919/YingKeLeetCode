package com.yingke.swordoffer.medium;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-27
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer64_求1到n的和 {

    /**
     * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     *
     *  
     *
     * 示例 1：
     *
     * 输入: n = 3
     * 输出: 6
     * 示例 2：
     *
     * 输入: n = 9
     * 输出: 45
     *  
     *
     * 限制：
     *
     * 1 <= n <= 10000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/qiu-12n-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public int sumNums(int n) {
        if (n == 1) {
            return 1;
        }
        return sumNums(n - 1) + n;

    }
}
