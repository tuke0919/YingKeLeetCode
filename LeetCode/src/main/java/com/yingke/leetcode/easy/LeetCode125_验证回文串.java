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
public class LeetCode125_验证回文串 {

    /**
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     *
     * 说明：本题中，我们将空字符串定义为有效的回文串。
     *
     * 示例 1:
     *
     * 输入: "A man, a plan, a canal: Panama"
     * 输出: true
     * 示例 2:
     *
     * 输入: "race a car"
     * 输出: false
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/valid-palindrome
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 搞了半天才搞懂什么是回文串
     *
     * "A man, a plan, a canal: Panama"
     * 删掉空格和逗号
     *
     * AmanaplanacanalPanama
     * 然后以c为中心，左右两边是对称的！！！真没想到英文也如此博大精深。
     *
     * Amanaplana   c   analPanama
     *
     *
     */

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        return usingStringBuffer(s);

    }

    private boolean usingStringBuffer(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    private boolean usingTwoPointer(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            while (low < high && !Character.isLetterOrDigit(s.charAt(low))) {
                low ++;
            }
            while (low < high && !Character.isLetterOrDigit(s.charAt(high))) {
                high--;
            }
            if (Character.isLowerCase(s.charAt(low)) != Character.isLowerCase(s.charAt(high)) ) {
                return false;
            }
            low ++;
            high ++;
        }
        return true;
    }







}
