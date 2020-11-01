package com.yingke.leetcode.medium;

import java.awt.TextArea;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-11-01
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode152_翻转字符串里的单词 {

    /**
     * 给定一个字符串，逐个翻转字符串中的每个单词。
     *
     * 说明：
     *
     * 无空格字符构成一个 单词 。
     * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
     * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
     *  
     *
     * 示例 1：
     *
     * 输入："the sky is blue"
     * 输出："blue is sky the"
     * 示例 2：
     *
     * 输入："  hello world!  "
     * 输出："world! hello"
     * 解释：输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
     * 示例 3：
     *
     * 输入："a good   example"
     * 输出："example good a"
     * 解释：如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
     * 示例 4：
     *
     * 输入：s = "  Bob    Loves  Alice   "
     * 输出："Alice Loves Bob"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String[] strs = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].length() != 0) {
                sb.append(strs[i]).append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString().trim();

    }
}
