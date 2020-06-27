package com.yingke.swordoffer.easy;

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
public class 剑指Offer58_II_左旋转字符串 {

    /**
     * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
     *
     *  
     *
     * 示例 1：
     *
     * 输入: s = "abcdefg", k = 2
     * 输出: "cdefgab"
     * 示例 2：
     *
     * 输入: s = "lrloseumgh", k = 6
     * 输出: "umghlrlose"
     *  
     *
     * 限制：
     *
     * 1 <= k < s.length <= 10000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 最简单解法
     *
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < n; i++){
            sb.append(s.charAt(i));
        }
        return sb.substring(n).toString();
    }

    /**
     * 分段反转
     *
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords1(String s, int n) {
        char[] chars = s.toCharArray();
        swap(chars, 0, n - 1);
        swap(chars, n, chars.length - 1);
        swap(chars, 0, chars.length - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length ; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();

    }

    public void swap(char[] chars, int start, int end){
        while (start < end) {
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start ++;
            end --;
        }
    }

}
