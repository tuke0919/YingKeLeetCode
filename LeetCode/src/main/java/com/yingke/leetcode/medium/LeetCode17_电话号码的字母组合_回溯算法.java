package com.yingke.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-29
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode17_电话号码的字母组合_回溯算法 {
    /**
     * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
     *
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     *
     *
     *
     * 示例:
     *
     * 输入："23"
     * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
     * 说明:
     * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public List<String> letterCombinations(String digits) {
        List<String > combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        HashMap<Character, String> map = new HashMap<Character, String>(){{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");

        }};

        backtrack(map, combinations, digits, 0, new StringBuilder());
        return combinations;


    }

    private void backtrack(HashMap<Character, String> map,
                           List<String > combinations,
                           String digits,
                           int index,
                           StringBuilder combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            combination.append(letters.charAt(i));
            backtrack(map, combinations, digits, index + 1, combination);
            combination.deleteCharAt(index);
        }
        return;
    }

}
