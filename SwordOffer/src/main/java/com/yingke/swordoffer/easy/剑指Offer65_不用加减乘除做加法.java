package com.yingke.swordoffer.easy;

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
public class 剑指Offer65_不用加减乘除做加法 {

    /**
     * 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
     *
     *  
     *
     * 示例:
     *
     * 输入: a = 1, b = 1
     * 输出: 2
     *  
     *
     * 提示：
     *
     * a, b 均可能是负数或 0
     * 结果不会溢出 32 位整数
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * https://leetcode-cn.com/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/solution/mian-shi-ti-65-bu-yong-jia-jian-cheng-chu-zuo-ji-7/
     *
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        while(b != 0) { // 当进位为 0 时跳出
            int c = (a & b) << 1;  // c = 进位
            a ^= b; // a = 非进位和
            b = c; // b = 进位
        }
        return a;

    }
}
