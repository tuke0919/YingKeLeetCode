package com.yingke.leetcode.medium;

import java.util.HashMap;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-28
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode3_无重复字符的最长子串 {
    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     * 示例 1:
     *
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     *
     * 输入: "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     *
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 暴力法 ：超出时间限制  986 / 987 个通过测试用例
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int max = 0;
        for (int  i= 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                if (!hasRepeat(str) && str.length() > max) {
                    max = str.length();
                }
            }
        }
        return max;
    }
    private boolean hasRepeat(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: str.toCharArray()) {
            if (map.containsKey(c)) {
                return true;
            } else {
                map.put(c,  1);
            }
        }
        return false;
    }


    /**
     * 双指针 滑动窗口设置
     * 滑动窗口： 设置两个指针 l 、r 分别表示为窗口的左右两端，初始化为 l = 0 ，r = -1 ；
     * 每遇到一个新元素时，遍历窗口内的元素看是否出现过，若在窗口内有同样的元素，则把左边界移到这个元素的后面一位；
     * 否则增加又边界。 时间复杂度：O（n*m），遍历了n次窗口，n为字符串长度，m为窗口长度。 空间复杂度：O（n）
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int left  = 0;
        int right = 0;
        int max = 0;

        for (; right < s.length(); right++) {
            // 滑动窗口 [left, right]
            for (int k = left; k < right; k++) {
                // 新元素 是right， 检查新元素 在窗口内是否出现过，
                // 1，出现过代表 窗口内有重复元素，就移动 左边界，
                // 2，没出现过代表 窗口是内无重复元素，计算此时的长度
                if (s.charAt(right) == s.charAt(k)) {
                    left = k + 1;
                    break;
                }
            }
            if (right - left + 1 > max) {
                max = right - left + 1;
            }
        }
        return max;
    }


}
