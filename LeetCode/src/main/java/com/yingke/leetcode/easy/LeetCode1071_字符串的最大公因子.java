package com.yingke.leetcode.easy;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-27
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode1071_字符串的最大公因子 {

    /**
     * 对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
     *
     * 返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：str1 = "ABCABC", str2 = "ABC"
     * 输出："ABC"
     * 示例 2：
     *
     * 输入：str1 = "ABABAB", str2 = "ABAB"
     * 输出："AB"
     * 示例 3：
     *
     * 输入：str1 = "LEET", str2 = "CODE"
     * 输出：""
     *  
     *
     * 提示：
     *
     * 1 <= str1.length <= 1000
     * 1 <= str2.length <= 1000
     * str1[i] 和 str2[i] 为大写英文字母
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/greatest-common-divisor-of-strings
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


/*
        如果 str1 和 str2 存在最大公约数 str，那么就相当于 str1 和 str2 都是由 str 组成的，那么 str1 + str2 和 str2 + str1 应该是相等的
        如果不满足，那么不存在最大公约数

        我们可以通过 两个字符串的长度来求得最大公约数的长度
        比如 str1 = "ABABAB", str2 = "ABAB"
            len1 = 6         len2 = 4
            那么最大公约数 str = "AB"
                         len = 2
        */

    public String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }

        int r = m % n;
        return gcd(n, r);
    }




}
