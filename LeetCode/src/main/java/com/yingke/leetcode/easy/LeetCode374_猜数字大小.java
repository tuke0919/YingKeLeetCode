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
public class LeetCode374_猜数字大小 {
    /**
     * 猜数字游戏的规则如下：
     *
     * 每轮游戏，我都会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。
     * 如果你猜错了，我会告诉你，你猜测的数字比我选出的数字是大了还是小了。
     * 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情况（-1，1 或 0）：
     *
     * -1：我选出的数字比你猜的数字小 pick < num
     * 1：我选出的数字比你猜的数字大 pick > num
     * 0：我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
     *  
     *
     * 示例 1：
     *
     * 输入：n = 10, pick = 6
     * 输出：6
     * 示例 2：
     *
     * 输入：n = 1, pick = 1
     * 输出：1
     * 示例 3：
     *
     * 输入：n = 2, pick = 1
     * 输出：1
     * 示例 4：
     *
     * 输入：n = 2, pick = 2
     * 输出：2
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/guess-number-higher-or-lower
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    class GuessGame {
        /**
         * Forward declaration of guess API.
         * @param  num   your guess
         * @return 	     -1 if num is lower than the guess number
         *			      1 if num is higher than the guess number
         *               otherwise return 0
         * int guess(int num);
         */
        int guess(int num){
            return 0;

        }
    }

    public class Solution extends GuessGame {
        /**
         * 二分法
         * @param n
         * @return
         */
        public int guessNumber(int n) {
            int left = 1, right = n, res, mid;
            while (left <= right) {
                mid = left + (right - left) / 2;
                res = guess(mid);
                if (res == 0) return mid;
                else if (res == 1) left = mid + 1;
                else right = mid - 1;
            }
            return -1;

        }
    }

}
