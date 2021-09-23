package leetcode.leetcode0828;

/**
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 * 示例 2：
 *
 * 输入：s = "   fly me   to   the moon  "
 * 输出：4
 * 示例 3：
 *
 * 输入：s = "luffy is still joyboy"
 * 输出：6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode0828_5 {
    public int lengthOfLastWord(String s) {
        int length = 0;
        // 因为要的是最后一个单词的长度，所以可以从后往前即从s.length - 1 开始
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                // 如果没有遇到空格自增
                length++;
            } else if (length != 0) {
                // 返回一个不为0的length，就会把空格隔离出来
                return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String str = "   fly me   to   the moon  "; // 4
        String str1 = "luffy is still joyboy"; // 6
        String str2 = "Hello World"; // 5
        LeetCode0828_5 lc = new LeetCode0828_5();
        System.out.println(lc.lengthOfLastWord(str));
        System.out.println(lc.lengthOfLastWord(str1));
        System.out.println(lc.lengthOfLastWord(str2));
    }
}
