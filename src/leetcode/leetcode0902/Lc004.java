package leetcode.leetcode0902;

/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "abcd", t = "abcde"
 * 输出："e"
 * 解释：'e' 是那个被添加的字母。
 * 示例 2：
 *
 * 输入：s = "", t = "y"
 * 输出："y"
 * 示例 3：
 *
 * 输入：s = "a", t = "aa"
 * 输出："a"
 * 示例 4：
 *
 * 输入：s = "ae", t = "aea"
 * 输出："a"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc004 {

    /**
     * 要找到新增加的字符证明，除了那一个字符其他字符转AscII码之后的和是一样的，做差值之后在转换成char就是
     * 所求得的字符
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        int sumS = 0; // 存储第一个字符串的AscII的和
        int sumT = 0; // 存储第二个字符串的AscII的和
        for (int i = 0; i < s.length(); i++) {
            sumS += s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            sumT += t.charAt(i);
        }
        return (char) (sumS > sumT ? sumS - sumT : sumT - sumS);
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        Lc004 lc = new Lc004();
        System.out.println("返回" + lc.findTheDifference(s, t));
    }
}
