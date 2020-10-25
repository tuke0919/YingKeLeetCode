package com.yingke.leetcode.easy;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-20
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode67_二进制求和 {

    /**
     * 给你两个二进制字符串，返回它们的和（用二进制表示）。
     *
     * 输入为 非空 字符串且只包含数字 1 和 0。
     *
     *  
     *
     * 示例 1:
     *
     * 输入: a = "11", b = "1"
     * 输出: "100"
     * 示例 2:
     *
     * 输入: a = "1010", b = "1011"
     * 输出: "10101"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-binary
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 分享Java的一种解决思路(参考链表加法的思想)：
     */
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int carry = 0, i = a.length()-1, j = b.length()-1;
        while(i >= 0 || j >= 0 || carry != 0){
            if(i >= 0) carry += a.charAt(i--)-'0';
            if(j >= 0) carry += b.charAt(j--)-'0';
            sb.append(carry%2);
            carry /= 2;
        }
        return sb.reverse().toString();

    }
}
