package com.yingke.leetcode.medium;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-11-01
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class LeetCode62_不同的路径_动态规划 {
    /**
     * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
     *
     * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
     *
     * 问总共有多少条不同的路径？
     *
     *
     *
     * 例如，上图是一个7 x 3 的网格。有多少可能的路径？
     *
     *  
     *
     * 示例 1:
     *
     * 输入: m = 3, n = 2
     * 输出: 3
     * 解释:
     * 从左上角开始，总共有 3 条路径可以到达右下角。
     * 1. 向右 -> 向右 -> 向下
     * 2. 向右 -> 向下 -> 向右
     * 3. 向下 -> 向右 -> 向右
     * 示例 2:
     *
     * 输入: m = 7, n = 3
     * 输出: 28
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/unique-paths
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     *
     */

    /**
     * 动态规划
     * 状态转移方程：dp[m][n] = dp[m][n-1] + dp[m - 1]dp[n]
     * 结束条件：dp[1][1] = 1
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int row = m + 1;
        int col = n + 1;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (i == 1 && j == 1){
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[m][n];
    }



}
