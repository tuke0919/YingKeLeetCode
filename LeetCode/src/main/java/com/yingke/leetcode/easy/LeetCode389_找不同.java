package com.yingke.leetcode.easy;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-24
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode389_找不同 {
    /**
     *
     * 给定两个字符串 s 和 t，它们只包含小写字母。
     *
     * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
     *
     * 请找出在 t 中被添加的字母。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：s = "abcd", t = "abcde"
     * 输出："e"
     * 解释：'e' 是那个被添加的字母。
     * 示例 2：
     *
     * 输入：s = "", t = "y"
     * 输出："y"
     * 示例 3：
     *
     * 输入：s = "a", t = "aa"
     * 输出："a"
     * 示例 4：
     *
     * 输入：s = "ae", t = "aea"
     * 输出："a"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-the-difference
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 异或运算
     * 1，a ^ a = 0
     * 2，a ^ 0 = a
     * 3, 交换律和结合律
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {

        String str = s + t;
        // ASCII 是0的字符
        char c0 = '0' - 48;
        for (char c : str.toCharArray()) {
            c0 = (char) (c0 ^ c);
        }
        return c0;
    }
}
