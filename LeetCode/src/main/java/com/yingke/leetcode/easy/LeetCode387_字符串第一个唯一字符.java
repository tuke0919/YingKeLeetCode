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
public class LeetCode387_字符串第一个唯一字符 {
    /**
     * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     *
     *  
     *
     * 示例：
     *
     * s = "leetcode"
     * 返回 0
     *
     * s = "loveleetcode"
     * 返回 2
     *  
     *
     * 提示：你可以假定该字符串只包含小写字母。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/first-unique-character-in-a-string
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }

        for (int i = 0; i < s.length() ; i++ ) {
            int first = s.indexOf(s.charAt(i));
            int last = s.lastIndexOf(s.charAt(i));
            if (first == last) {
                return i;
            }

        }

        return -1;
    }

}
