package com.yingke.swordoffer.easy;

import java.util.ArrayList;
import java.util.List;

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
public class 剑指Offer62_圆圈中最后剩下的数字 {

    /**
     * 0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
     *
     * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
     *
     *  
     *
     * 示例 1：
     *
     * 输入: n = 5, m = 3
     * 输出: 3
     * 示例 2：
     *
     * 输入: n = 10, m = 17
     * 输出: 2
     *  
     *
     * 限制：
     *
     * 1 <= n <= 10^5
     * 1 <= m <= 10^6
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/solution/huan-ge-jiao-du-ju-li-jie-jue-yue-se-fu-huan-by-as/
     *
     * @param n
     * @param m
     * @return
     */
    public int lastRemaining(int n, int m) {

        // 最终活下来那个人的初始位置
        int last = 0;
        for (int i = 2; i <= n; i++) {
            // 每次循环右移
            last = (last + m) % i;
        }
        return last;
    }

    /**
     * 暴力法
     *
     * @param n
     * @param m
     * @return
     */
    public int lastRemaining1(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(i);
        }
        int start = 0;
        while(list.size() > 1) {
            int size = list.size();
            int next = (m + start - 1) % size;
            list.remove(next);
            start = next;
        }
        return list.get(0);

    }
}


