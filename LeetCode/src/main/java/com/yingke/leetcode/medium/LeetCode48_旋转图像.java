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
public class LeetCode48_旋转图像 {
    /**
     * 给定一个 n × n 的二维矩阵表示一个图像。
     *
     * 将图像顺时针旋转 90 度。
     *
     * 说明：
     *
     * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
     *
     * 示例 1:
     *
     * 给定 matrix =
     * [
     *   [1,2,3],
     *   [4,5,6],
     *   [7,8,9]
     * ],
     *
     * 原地旋转输入矩阵，使其变为:
     * [
     *   [7,4,1],
     *   [8,5,2],
     *   [9,6,3]
     * ]
     * 示例 2:
     *
     * 给定 matrix =
     * [
     *   [ 5, 1, 9,11],
     *   [ 2, 4, 8,10],
     *   [13, 3, 6, 7],
     *   [15,14,12,16]
     * ],
     *
     * 原地旋转输入矩阵，使其变为:
     * [
     *   [15,13, 2, 5],
     *   [14, 3, 4, 1],
     *   [12, 6, 8, 9],
     *   [16, 7,10,11]
     * ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/rotate-image
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 转置加翻转
     * @param matrix
     */
    public void rotate(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i= 0; i < rows; i++) {
            for (int j = i;  j < rows; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i= 0; i < rows; i++) {
            for (int j = 0; j < rows / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][rows - j - 1];
                matrix[i][rows - j - 1] = tmp;
            }
        }


    }
}
