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
public class 剑指Offer15_二进制中1的个数 {

    /**
     * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
     *
     * 示例 1：
     *
     * 输入：00000000000000000000000000001011
     * 输出：3
     * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
     * 示例 2：
     *
     * 输入：00000000000000000000000010000000
     * 输出：1
     * 解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
     * 示例 3：
     *
     * 输入：11111111111111111111111111111101
     * 输出：31
     * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    // you need to treat n as an unsigned value

    /**
     * 超时了
     * 和1 按位与，是否等1，然后右移一位
     * @param n
     * @return
     */
    public int hammingWeight(int n) {

        int count = 0;
        int tmp  = n;
        while (tmp != 0) {
            if ((tmp & 1) == 1) {
                count ++;
            }
            tmp = tmp >> 1;
        }
        return count;
    }


    /**
     * 把一个整数减去1，再和原整数做与运算，
     * 会把该整数最右边一个1变成0.那么一个整数的二进制有多少个1，就可以进行多少次这样的操作。
     *
     * @param n
     * @return
     */
    public int hammingWeight1(int n) {
        int count = 0;
        while (n != 0) {
            count ++;
            n = n & (n - 1);
        }
        return count;
    }



}
