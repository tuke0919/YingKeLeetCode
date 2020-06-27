package com.yingke.swordoffer.easy;

import java.util.Stack;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-26
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer58_I_翻转单词顺序 {
    /**
     * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
     *
     *  
     *
     * 示例 1：
     *
     * 输入: "the sky is blue"
     * 输出: "blue is sky the"
     * 示例 2：
     *
     * 输入: "  hello world!  "
     * 输出: "world! hello"
     * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
     * 示例 3：
     *
     * 输入: "a good   example"
     * 输出: "example good a"
     * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
     *  
     *
     * 说明：
     *
     * 无空格字符构成一个单词。
     * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
     * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


    /**
     * 双指针： 倒叙遍历
     *
     * 1， 索引i 从右向左搜索首个空格
     * 2，添加单词s[i+ 1, j+1]至res
     * 3，索引i跳过两个单词间的所有空格
     * 4，执行j=i，使j指向下一个单词 的末尾字符
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        if (s == null){
            return null;
        }

        s = s.trim();
        int j = s.length() - 1;
        int i = j;
        StringBuilder sb = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                 i--;
            }
            sb.append(s.substring(i + 1, j + 1) + " ");
            while (i >= 0 && s.charAt(i) == ' ') {
                 i--;
            }
            j = i;
        }
        return sb.toString().trim();
    }


}
