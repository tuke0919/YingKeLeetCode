package com.yingke.leetcode.easy;

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
public class LeetCode415_字符串相加 {

    /**
     * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
     *
     *  
     *
     * 提示：
     *
     * num1 和num2 的长度都小于 5100
     * num1 和num2 都只包含数字 0-9
     * num1 和num2 都不包含任何前导零
     * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-strings
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public String addStrings(String num1, String num2) {

        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;// 进位

        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry = carry + (num1.charAt(i) - '0');
                i--;
            }

            if (j >= 0) {
                carry = carry + (num2.charAt(j) - '0');
                j--;
            }

            sb.append(carry % 10);
            carry = carry / 10;
        }
        return sb.reverse().toString();

    }
}
