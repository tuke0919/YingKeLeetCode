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
public class LeetCode510_单词检测大写字母是否正确 {
    /**
     * 给定一个单词，你需要判断单词的大写使用是否正确。
     *
     * 我们定义，在以下情况时，单词的大写用法是正确的：
     *
     * 全部字母都是大写，比如"USA"。
     * 单词中所有字母都不是大写，比如"leetcode"。
     * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
     * 否则，我们定义这个单词没有正确使用大写字母。
     *
     * 示例 1:
     *
     * 输入: "USA"
     * 输出: True
     * 示例 2:
     *
     * 输入: "FlaG"
     * 输出: False
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/detect-capital
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }

        int count = 0;
        for (char c: word.toCharArray()) {
            if (isUpperChar(c)) {
                count ++;
            }
        }
        if (count == 0 || count == word.length()) {
            return true;
        }
        if (count == 1 && isUpperChar(word.charAt(0))) {
            return true;
        }
        return false;
    }

    private boolean isUpperChar(char c) {
        return c >= 65 && c <= 90;
    }


}
