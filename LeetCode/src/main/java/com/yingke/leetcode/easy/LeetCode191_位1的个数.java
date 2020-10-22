package com.yingke.leetcode.easy;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-10-21
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode191_位1的个数 {

    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0){
            count ++;
            n = n & (n - 1);
        }

        return count;

    }
}
