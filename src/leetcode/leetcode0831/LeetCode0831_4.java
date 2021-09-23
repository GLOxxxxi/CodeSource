package leetcode.leetcode0831;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 给定两个字符串  s  和  t，判断它们是否是同构的。
 *
 * 如果  s  中的字符可以按某种映射关系替换得到  t  ，那么这两个字符串是同构的。
 *
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 *
 *   
 *
 * 示例 1:
 *
 * 输入：s = "egg", t = "add"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "foo", t = "bar"
 * 输出：false
 * 示例 3：
 *
 * 输入：s = "paper", t = "title"
 * 输出：true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/isomorphic-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode0831_4 {
    /**
     * 此题可以运用map双向映射的思路
     * 因为map的key值唯一，当左右映射不匹配的时候就可以return false
     *
     * 创建两个map第一个 用s的字符映射t的字符， 第二个map 用t字符映射s字符
     * 从左往右遍历，如果左右映射值不同只返回false，不同就加到对应的map中
     * 以foo，bar为例
     * 第一次进入，全false直接插入
     * 第二次进入，false && __ || false && __
     * 第三次，true && true || 短路
     * @param s
     * @param t
     * @return
     */

    public boolean isIsomorphic(String s, String t) {
        // 创建s->t的映射和t->s的映射
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            // 接收两个字符串的字符
            char x = s.charAt(i);
            char y = t.charAt(i);
            if (s2t.containsKey(x) && s2t.get(x) != y || t2s.containsKey(y) && t2s.get(y) != x) {
            return false;
            }
            // 映射成功放入对应map
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode0831_4 lc = new LeetCode0831_4();
        String s = "foo";
        String t = "bar";
        System.out.println(lc.isIsomorphic(s, t));
    }
}
