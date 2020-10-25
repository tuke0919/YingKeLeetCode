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
public class LeetCode557_反转字符串中的单词_III {

    /**
     * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     *
     *  
     *
     * 示例：
     *
     * 输入："Let's take LeetCode contest"
     * 输出："s'teL ekat edoCteeL tsetnoc"
     *  
     *
     * 提示：
     *
     * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public String reverseWords(String s) {

        int k = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] == ' '  ) {
                reverse(chars, k, i -1);
                k  = i + 1;
            }
        }
        return new String(chars);

    }

    private void reverse(char[] chars, int i, int j) {
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }
    }

}
