package com.yingke.leetcode.easy;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-25
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode459_重复的子字符串 {
    /**
     * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
     *
     * 示例 1:
     *
     * 输入: "abab"
     *
     * 输出: True
     *
     * 解释: 可由子字符串 "ab" 重复两次构成。
     * 示例 2:
     *
     * 输入: "aba"
     *
     * 输出: False
     * 示例 3:
     *
     * 输入: "abcabcabcabc"
     *
     * 输出: True
     *
     * 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/repeated-substring-pattern
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return false;
        }
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            String str = s.substring(0, i + 1);
            // 可能是
            if (s.lastIndexOf(str) + str.length() != len) {
                continue;
            }
            // 全部替换了，肯定是
            if (s.replaceAll(str, "").equals("")) {
                return true;
            }
        }

        return false;

    }


}
