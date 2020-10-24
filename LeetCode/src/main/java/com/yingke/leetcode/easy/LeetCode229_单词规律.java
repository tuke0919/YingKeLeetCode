package com.yingke.leetcode.easy;

import java.util.HashMap;

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
public class LeetCode229_单词规律 {

    /**
     *给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
     *
     * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
     *
     * 示例1:
     *
     * 输入: pattern = "abba", str = "dog cat cat dog"
     * 输出: true
     * 示例 2:
     *
     * 输入:pattern = "abba", str = "dog cat cat fish"
     * 输出: false
     * 示例 3:
     *
     * 输入: pattern = "aaaa", str = "dog cat cat dog"
     * 输出: false
     * 示例 4:
     *
     * 输入: pattern = "abba", str = "dog dog dog dog"
     * 输出: false
     * 说明:
     * 你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。    
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/word-pattern
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     */

    /**
     * hashmap 同 LeetCode205 同构字符串一样
     * @param pattern
     * @param s
     * @return
     */
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null) {
            return false;
        }

        String[] strs = s.split(" ");
        if (strs == null || strs.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++ ) {
            Character c1 = pattern.charAt(i);
            String s1 = strs[i];
            if (!map.containsKey(c1)) {
                if (map.containsValue(s1)) {
                    return false;
                }
                map.put(c1, s1);
            } else {
                if (!s1.equals(map.get(c1))) {
                    return false;
                }
            }
        }
        return true;

    }


}
