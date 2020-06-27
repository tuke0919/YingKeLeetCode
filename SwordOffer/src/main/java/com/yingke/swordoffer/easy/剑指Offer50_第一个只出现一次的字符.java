package com.yingke.swordoffer.easy;

/**
 * 功能：
 * </p>
 * <p>Copyright xxx.xxx.com 2020 All right reserved </p>
 *
 * @author tuke 时间 2020-06-27
 * @email <p>
 * 最后修改人：无
 * <p>
 */
public class 剑指Offer50_第一个只出现一次的字符 {

    /**
     * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
     *
     * 示例:
     *
     * s = "abaccdeff"
     * 返回 "b"
     *
     * s = ""
     * 返回 " "
     *  
     *
     * 限制：
     *
     * 0 <= s 的长度 <= 50000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 思路分析：
     *
     * 要求只出现一次的第一个字符，就需要去计数每一个字符出现了几次。一般都是用哈希表，但是字符往多了数按照扩展的ASCII码也就256个，就可以使用int[] count来代替哈希表：键就是字符对应的数，值就是该字符出现的次数。
     * 第一次遍历计数每个字符出现的次数for(char c : chars) count[c]++;。第二次遍历按顺序去查看该字符出现了几次，如果该字符出现了1次，它就是第一个仅出现一次的字符，直接返回。
     * 如果第二次遍历没有返回，就说明没有仅出现一次的字符，返回' '。
     * 时间复杂度为O(n)，空间复杂度为O(n)（因为使用了辅助的字符数组）。
     *
     * 作者：ustcyyw
     * 链接：https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/solution/mian-shi-ti-50java-shi-yong-shu-zu-dai-ti-ha-xi-bi/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param s
     * @return
     */
    public char firstUniqChar(String s) {
        int[] count = new int[256];
        char[] chars = s.toCharArray();

        for (char c: chars) {
            count[c] ++;
        }

        for (char c: chars) {
            if (count[c] == 1) {
                return c;
            }
        }
        return ' ';
    }
}
