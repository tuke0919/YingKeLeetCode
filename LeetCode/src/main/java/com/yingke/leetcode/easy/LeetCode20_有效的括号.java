package com.yingke.leetcode.easy;

import java.nio.charset.CharacterCodingException;
import java.util.Stack;

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
public class LeetCode20_有效的括号 {

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     *
     * 示例 1:
     *
     * 输入: "()"
     * 输出: true
     * 示例 2:
     *
     * 输入: "()[]{}"
     * 输出: true
     * 示例 3:
     *
     * 输入: "(]"
     * 输出: false
     * 示例 4:
     *
     * 输入: "([)]"
     * 输出: false
     * 示例 5:
     *
     * 输入: "{[]}"
     * 输出: true
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/valid-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     */

    /**
     * 超出时间限制
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s.replace("{}", "");
            s.replace("()", "");
            s.replace("[]", "");
        }

        return s.isEmpty();

    }

    /**
     * 用栈
     *
     * @param s
     * @return
     */
    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c: s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{'){
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }

        return stack.isEmpty();
    }


}
